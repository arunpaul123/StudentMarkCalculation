import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatemarkTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void markcalculation() {
		Calculatemark calculatemark=new Calculatemark();
		assertEquals(27,calculatemark.markcalculation(35,45,55));
	
	
	}}
	
	


