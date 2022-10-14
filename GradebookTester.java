import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	
	private GradeBook g1;
	private GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(79);
		g1.addScore(99);
		g1.addScore(5);
		
		g2.addScore(56);
		g2.addScore(103);
		g2.addScore(59);
		
	
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}


	@Test
	void testAddScore() {
		if(g1.addScore(79)&& g1.addScore(99) && g1.addScore(5))
		{
			assertTrue(g1.toString().equals("79.0 99.0 5.0 "));
		}
		
		
	}

	@Test
	void testSum() {
		assertEquals(183, g1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(5, g1.minimum(), .001);
	}
	
	@Test
	void testFinalScore()
	{
		if(!g1.addScore(0))
		{
			assertEquals(0, g1.finalScore(), .0001);
		}
		if(g1.addScore(79)&& g1.addScore(99)&& g1.addScore(5))
		{
			assertEquals(178, g1.finalScore(), .0001);
		}
		
		
		
	}

	

}
