package de.dc.workbench.fx.ui.rules.mapper;

import de.dc.workbench.fx.ui.rules.Output;

public interface IOutputMapper<T> {

	T mapTo(Output output);

}
