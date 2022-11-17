package de.dc.workbench.fx.ui.rules.app;
	
import com.google.inject.Inject;

import de.dc.workbench.fx.core.event.EventContext;
import de.dc.workbench.fx.core.event.EventTopic;
import de.dc.workbench.fx.core.log.di.LogModule;
import de.dc.workbench.fx.core.workspace.di.WorkspaceModule;
import de.dc.workbench.fx.core.workspace.service.IWorkspaceService;
import de.dc.workbench.fx.core.xtext.IXtextService;
import de.dc.workbench.fx.core.xtext.di.XtextModule;
import de.dc.workbench.fx.ui.EmfApplicationStandalone;
import de.dc.workbench.fx.ui.EmfWorkbench;
import de.dc.workbench.fx.ui.monaco.di.MonacoModule;
import de.dc.workbench.fx.ui.monaco.service.IMonacoLanguageService;
import de.dc.workbench.fx.ui.rules.spell.RulesDslStandaloneSetup;
import de.dc.workbench.fx.ui.views.di.ViewsModule;

public class RulesEditorApp extends EmfApplicationStandalone{

	@Inject IMonacoLanguageService monacoService;
	@Inject IWorkspaceService workspaceService;
	@Inject IXtextService xtextService;
	
	@Override
	protected void addModules() {
		addModule(new ViewsModule());
		addModule(new WorkspaceModule());
		addModule(new MonacoModule());
		addModule(new XtextModule());
		addModule(new LogModule());
	}
	
	@Override
	protected void initStandaloneWorkbench(EmfWorkbench workbench) {
		super.initStandaloneWorkbench(workbench);
		
		RulesDslStandaloneSetup setup = new RulesDslStandaloneSetup();
		xtextService.register("rules", setup);
		xtextService.registerByFileExtension("rulesspell", setup);
		
		monacoService.loadAll();
	}
	
	@Override
	public void subscribeOpenWorkspace(EventContext<Object> context) {
		if (context.match(EventTopic.OPEN_WORKSPACE_LOCATION)) {
			var location = workspaceService.getWorkspaceLocation();
			getHostServices().showDocument(location);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
