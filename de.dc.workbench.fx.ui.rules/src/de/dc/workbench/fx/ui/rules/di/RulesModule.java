package de.dc.workbench.fx.ui.rules.di;

import com.google.inject.AbstractModule;

import de.dc.workbench.fx.ui.rules.service.IRulesService;
import de.dc.workbench.fx.ui.rules.service.RulesService;

public class RulesModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(IRulesService.class).to(RulesService.class);
	}
}
