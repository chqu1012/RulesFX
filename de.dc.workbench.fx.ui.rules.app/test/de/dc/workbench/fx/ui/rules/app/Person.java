package de.dc.workbench.fx.ui.rules.app;

public class Person {

	private String name;
	private int age;
	private boolean isSingle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSingle() {
		return isSingle;
	}

	public void setSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
