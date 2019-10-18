import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testaveragemark {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Testaveragemark() {
		Calculatemark  calcmark=new Calculatemark();
		assertEquals(75,calcmark.averagemark(25, 0));
		
		fail("Not yet implemented");
	}

}
