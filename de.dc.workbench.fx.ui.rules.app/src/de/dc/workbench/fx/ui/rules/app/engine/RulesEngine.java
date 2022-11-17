package de.dc.workbench.fx.ui.rules.app.engine;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.dc.workbench.fx.core.command.di.EmfFXPlatform;
import de.dc.workbench.fx.core.xtext.IXtextService;
import de.dc.workbench.fx.core.xtext.di.XtextModule;
import de.dc.workbench.fx.ui.rules.Output;
import de.dc.workbench.fx.ui.rules.OutputField;
import de.dc.workbench.fx.ui.rules.Rule;
import de.dc.workbench.fx.ui.rules.RuleSet;
import de.dc.workbench.fx.ui.rules.RulesManager;
import de.dc.workbench.fx.ui.rules.RulesPackage;
import de.dc.workbench.fx.ui.rules.di.RulesModule;
import de.dc.workbench.fx.ui.rules.mapper.IOutputMapper;
import de.dc.workbench.fx.ui.rules.spell.RulesDslStandaloneSetup;

public class RulesEngine {
	
	private static final Logger LOGGER = Logger.getLogger(RulesEngine.class);

	private Map<List<String>, RuleSet> rulePatterns = new HashMap<>();
	
	public void useStandalone() {
		EmfFXPlatform.add(new RulesModule());
		EmfFXPlatform.add(new XtextModule());
		EmfFXPlatform.init();
		
		RulesDslStandaloneSetup setup = new RulesDslStandaloneSetup();
		
		var rulesPackage = RulesPackage.eINSTANCE;
		
		IXtextService xtextService = EmfFXPlatform.getInstance(IXtextService.class);
		xtextService.register("rules", setup);
		xtextService.registerByFileExtension("rulesspell", setup);
	}
	
	public void load(String filepath) throws IOException {
		RulesDslStandaloneSetup setup = new RulesDslStandaloneSetup();
		
		IXtextService xtextService = EmfFXPlatform.getInstance(IXtextService.class);
		xtextService.register("rules", setup);
		xtextService.registerByFileExtension("rulesspell", setup);
		
		EObject object = xtextService.getRootFromDsl(new File(filepath));
		if (object instanceof RulesManager manager) {
			load(manager);
		}
	}
	
	public void load(RulesManager manager) {
		for (RuleSet ruleSet : manager.getRuleSet()) {
			List<String> rules = ruleSet.getRules().stream().map(Rule::getPattern).toList();
			rulePatterns.put(rules, ruleSet);
		}
	}
	
	public Object findResult(String...patterns) {
		RuleSet ruleSet = findRuleSet(patterns);
		if (ruleSet != null) {
			Output o = ruleSet.getOutput();
			if (o.getMapper()!=null) {
				try {
					Class mapper = Class.forName(o.getMapper().getUri());
					Object obj = mapper.newInstance();
					if (obj instanceof IOutputMapper m) {
						return m.mapTo(o);
					}
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
					LOGGER.error("Failed to create Mapper class for uri "+o.getMapper().getUri(), e);
				}
			}else {
				try {
					Class clazz = Class.forName(o.getModel().getUri());
					Object obj = clazz.newInstance();
					for (OutputField field : o.getFields()) {
						Field declaredField = obj.getClass().getDeclaredField(field.getName());
						declaredField.setAccessible(true);
						declaredField.set(obj,  field.getValue());
					}
					return obj;
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
					LOGGER.error("Failed to create model class for uri "+o.getModel().getUri(), e);
				}
			}
		}
		return null;
	}
	
	public RuleSet findRuleSet(String...patterns) {
		for (Entry<List<String>, RuleSet> entry : rulePatterns.entrySet()) {
			if (entry.getKey().containsAll(Arrays.asList(patterns))) {
				return entry.getValue();
			}
		}
		return null;
	}
}
