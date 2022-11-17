package de.dc.workbench.fx.ui.rules.app;

import de.dc.workbench.fx.core.modul.Modul;
import de.dc.workbench.fx.core.modul.model.BaseEmfModul;
import de.dc.workbench.fx.core.modul.model.IModul;

@IModul(id = "de.dc.workbench.fx.ui.rules")
public class RulesModul extends BaseEmfModul{

	@Override
	public Modul getModul() {
		var modul = super.getModul();
		perspective.setHideEditorArea(false);
		return modul;
	}
	
	@Override
	protected String getName() {
		return "ExtendedRules";
	}

	@Override
	protected String getId() {
		return "de.dc.workbench.fx.ui.rules.extended";
	}

	public static void main(String[] args) {
		RulesModul rulesModul = new RulesModul();
		rulesModul.getModul();
	}
}
