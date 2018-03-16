package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConcatTest {

	@Test
	public void Concattest() {
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
