package de.dc.workbench.fx.ui.rules.app;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import de.dc.workbench.fx.ui.rules.app.engine.RulesEngine;

public class RulesEngineTest {

	@Test
	public void testRuleEngine() throws IOException {
		String pathname = "workspace\\persons\\persons.rulesspell";
		RulesEngine engine = new RulesEngine();
		engine.useStandalone();
		engine.load(pathname);
		
		Object result = engine.findResult("1,80m");
		assertNotNull(result);
		if (result instanceof Person p) {
			assertEquals(p.getName(), "Jennifer Garner");
			assertEquals(p.getAge(), 25);
			assertEquals(p.isSingle(), true);
		}
		
		result = engine.findResult("1,75m", "red", "Man");
		assertNotNull(result);
		if (result instanceof Person p) {
			assertEquals(p.getName(), "Peter Jackson");
			assertEquals(p.getAge(), 33);
			assertEquals(p.isSingle(), true);
		}

		result = engine.findResult("1,80m", "blue", "Woman");
		assertNotNull(result);
		if (result instanceof Person p) {
			assertEquals(p.getName(), "Jennifer Garner");
			assertEquals(p.isSingle(), true);
			assertEquals(p.getAge(), 25);
		}
	}

}
