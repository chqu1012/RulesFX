package de.dc.workbench.fx.ui.rules.mapper;

import de.dc.workbench.fx.ui.rules.Output;
import de.dc.workbench.fx.ui.rules.OutputField;

public abstract class OutputMapper<T> implements IOutputMapper<T>{
	
	@Override
	public T mapTo(Output output) {
		return map(output);
	}

	protected T map(Output output) {
		try {
			T model = (T)getModel().newInstance();
			for (OutputField field : output.getFields()) {
				mapField(model, field.getName(), field.getValue());
			}
			return model;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	protected abstract void mapField(T model, String name, String value);

	protected abstract Class getModel();
	
	protected Boolean getBoolean(OutputField field) {
		String value = field.getValue();
		if (value==null) {
			return null;
		}
		return Boolean.parseBoolean(value);
	}

	protected Integer getInteger(OutputField field) {
		String value = field.getValue();
		if (value==null) {
			return null;
		}
		return Integer.parseInt(value);
	}

	protected Double getDouble(OutputField field) {
		String value = field.getValue();
		if (value==null) {
			return null;
		}
		return Double.parseDouble(null);
	}
}
