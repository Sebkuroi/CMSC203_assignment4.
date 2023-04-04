
/**
 * This class represents GFA test cases for a ManagementCompany object.
 * 
 * @author Farnaz Eivazi
 * @version 7/12/2022
 * 
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanystudentTest {
	Property newproperty;
	ManagementCompany mangementCo ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	public void testAddProperty() {
		newproperty = new Property ("New", "Wording", 2345, "FIRST LAST",4,2,3,2);		 
		assertEquals(mangementCo.addProperty(newproperty),2,2);
	}
	
	@Test
	public void testGetPropertiesCount() {
		newproperty = new Property ("New", "Wording", 2345, "FIRST LAST",4,2,3,2);		 
		assertEquals(mangementCo.addProperty(newproperty),2,2);
		assertEquals(mangementCo.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		{
			newproperty = new Property ("New", "Wording", 2345, "FIRST LAST",4,2,3,2);		 
			mangementCo.addProperty(newproperty);	
			String pStr ="These are the list of properties owned by " + mangementCo.getName() + ", taxID: " + mangementCo.getTaxID() + "\n____________________________\n"
					 + "____________________________" + "\nThe total managementfee is: "
					+ (newproperty.getRentAmount() * mangementCo.getMgmFeePer()) / 100;
		}
	}
}
