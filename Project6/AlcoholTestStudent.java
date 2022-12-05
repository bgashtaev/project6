/*
 * Instructor: Gary Thai 
 * Description: 
 * Due: 12/5/2022
 * Platform/compiler: javac 11.0.16
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Basang Gashtaev
*/
package Project6;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class AlcoholTestStudent {
	Alcohol a1,a2,a3 ;

	@Before
	public void setUp() throws Exception {
		a1 = new Alcohol("Mohito", Size.SMALL, true);
		a2 = new Alcohol("Mohito1", Size.MEDIUM, false);
		a3 = new Alcohol("Mohito2", Size.LARGE, false);
		
	}

	@After
	public void tearDown() throws Exception {
		a1=a2=a3 = null;
	}

	@Test
	public void testCalcPrice() throws NullPointerException {

		assertTrue(a1.calcPrice() == 2.6);
		assertTrue(a2.calcPrice() == 3.0);
		assertTrue(a3.calcPrice() == 4.0);

	}
	
	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(a1.equals(a1) == true);
		assertTrue(a2.equals(a3) == false);
	}

}
