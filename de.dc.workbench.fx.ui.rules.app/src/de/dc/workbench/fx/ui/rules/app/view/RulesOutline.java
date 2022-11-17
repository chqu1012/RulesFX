package de.dc.workbench.fx.ui.rules.app.view;

import java.io.IOException;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import de.dc.workbench.fx.core.event.EventContext;
import de.dc.workbench.fx.core.event.EventTopic;
import de.dc.workbench.fx.core.event.IEventBroker;
import de.dc.workbench.fx.core.xtext.IXtextService;
import de.dc.workbench.fx.ui.EmfFilteredTreeView;
import de.dc.workbench.fx.ui.monaco.MonacoTextEditor;
import de.dc.workbench.fx.ui.rules.RuleSet;
import de.dc.workbench.fx.ui.rules.RulesFactory;
import de.dc.workbench.fx.ui.rules.RulesManager;
import de.dc.workbench.fx.ui.rules.RulesPackage;
import de.dc.workbench.fx.ui.rules.provider.RulesItemProviderAdapterFactory;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeItem;

public class RulesOutline extends EmfFilteredTreeView<EObject>{

	@Inject IEventBroker eventBroker;
	@Inject IXtextService xtextService;
	
	public RulesOutline() {
		super("Outline");
		
		eventBroker.register(this);
	}

	@Override
	protected void onTreeViewSelectedItemChanged(ObservableValue<? extends TreeItem<EObject>> observable,
			TreeItem<EObject> oldValue, TreeItem<EObject> newValue) {
		super.onTreeViewSelectedItemChanged(observable, oldValue, newValue);
		if (newValue!=null) {
			var value = newValue.getValue();
			if (value instanceof RuleSet rs) {
//				eventBroker.post("/reveal/active/monaco/editor/to/line", value.get);
			}
		}
	}
	
	@Subscribe
	public void subscribeCurrentSelectedEditor(EventContext<Tab> context) {
		if (context.match(EventTopic.CURRENT_SELECTED_EDITOR) && context.getInput() instanceof MonacoTextEditor editor) {
			String text = editor.getInput().getText();
//			MarkdownDocument doc = flexmarkService.parseAst(text);
			try {
				EObject object = xtextService.getRootFromDsl("rulesspell", text);
//				EObject object = xtextService.getDslFromString("rulesspell", text);
				setInput((RulesManager) object);
				expandAll();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new RulesItemProviderAdapterFactory();
	}

	@Override
	protected EObject createRootModel() {
		return RulesFactory.eINSTANCE.createRulesManager();
	}

	@Override
	protected EPackage getEPackage() {
		return RulesPackage.eINSTANCE;
	}

}
