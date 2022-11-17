package de.dc.workbench.fx.ui.rules.preferences;

import de.dc.workbench.fx.ui.preferences.IPreferencePage;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class RulesPreferences extends BorderPane implements IPreferencePage{

	public RulesPreferences() {
		setCenter(new SplitPane(new TableView<>(), new VBox()));
	}
	
	@Override
	public String category() {
		return "Rules Editor";
	}

	@Override
	public String pageUri() {
		return RulesPreferences.class.getName();
	}

	@Override
	public boolean show() {
		return true;
	}

}
