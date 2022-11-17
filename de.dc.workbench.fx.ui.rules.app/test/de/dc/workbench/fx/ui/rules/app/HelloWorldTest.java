package de.dc.workbench.fx.ui.rules.app;

import java.io.IOException;

import de.dc.workbench.fx.ui.rules.app.engine.RulesEngine;

public class HelloWorldTest{

	public static void main(String[] args) throws IOException {
		String pathname = "workspace\\local\\helloworld.rulesspell";
		RulesEngine engine = new RulesEngine();
		engine.useStandalone();
		engine.load(pathname);
		Object result = engine.findResult("testing", "test", "Freund");
		if (result instanceof Person p) {
			System.out.println(p.getName());
		}
	}
}
