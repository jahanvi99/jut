package jut;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstr {

	@Test
	public void test() {
		jufunc junitstr = new jufunc();
		String result = junitstr.addstr("Hello", "Guadlahara");
		assertEquals("HelloGuadlahara", result);
		
		
	}

}
