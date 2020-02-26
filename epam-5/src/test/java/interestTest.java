

import static org.junit.Assert.*;

import org.junit.Test;

public class interestTest {
private static final double DELTA=1e-15;
	@Test
	public void testsimple() {
		interest i=new interest();
		assertEquals(20.0,i.simple(1000.0,1.0,2.0),DELTA);
	}
	public void testcompound() {
		compound i=new compound();
		assertEquals(25,i.compound(1000.0,1.0,2.0),DELTA);
	}

}
