/*
 * generated by Xtext 2.25.0
 */
package de.dc.workbench.fx.ui.rules.spell;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RulesDslStandaloneSetup extends RulesDslStandaloneSetupGenerated {

	public static void doSetup() {
		new RulesDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
