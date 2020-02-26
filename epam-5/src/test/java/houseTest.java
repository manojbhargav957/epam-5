

import static org.junit.Assert.*;

import org.junit.Test;

public class houseTest {

	@Test
	public void testcost() {
		house i=new house();
		assertEquals(30000,i.cost("standard",25,"no"));
	}

}
