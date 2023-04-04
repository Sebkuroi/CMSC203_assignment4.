
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestStudent {
	private Plot plot1, plot2, plot3, plot4, plot5;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(4, 1, 4, 7);
		plot2 = new Plot(6, 2, 6, 4);
		plot3 = new Plot(8, 3, 2, 2);
        plot4 = new Plot(4, 7, 4, 8);
        plot5 = new Plot(1, 5, 5, 2);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertFalse(plot1.overlaps(plot3)); 
	}
	
	@Test
	public void testToString() {
		assertEquals("4,1,4,7",plot1.toString());	
	}

}
