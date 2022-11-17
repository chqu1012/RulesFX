package de.dc.workbench.fx.ui.rules.app;

import de.dc.workbench.fx.ui.rules.mapper.OutputMapper;

public class PersonMapper extends OutputMapper<Person>{

	@Override
	protected void mapField(Person person, String name, String value) {
		switch (name) {
			case "name" -> person.setName(value);
			case "age" -> person.setAge(Integer.parseInt(value));
			case "isSingle" -> person.setSingle(Boolean.parseBoolean(value));
			default -> throw new IllegalArgumentException("Unexpected value: " + name);
		}
	}

	@Override
	protected Class<?> getModel() {
		return Person.class;
	}
}
