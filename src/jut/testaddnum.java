package jut;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnum {

	@Test
	public void test() {
		jufunc junit = new jufunc();
		int result = junit.addnum(100, 45);
		assertEquals (145, result);
	}

}
