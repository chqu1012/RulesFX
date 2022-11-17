package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.workbench.fx.ui.SimpleEmfEditor;
import de.dc.workbench.fx.ui.rules.provider.RulesItemProviderAdapterFactory;

public class RulesEditor extends SimpleEmfEditor<RulesManager>{

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
