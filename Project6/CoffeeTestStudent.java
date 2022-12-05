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
public class CoffeeTestStudent {
	Coffee c1,c2,c3 ;

	@Before
	public void setUp() throws Exception {
		c1 = new Coffee("regular Coffee", Size.SMALL, false, false);
		c2 = new Coffee("regular Coffee1", Size.MEDIUM, true, false);
		c3 =new Coffee("regular Coffee2", Size.LARGE, true,true);
		
	}

	@After
	public void tearDown() throws Exception {
		c1=c2=c3 = null;
	}

	@Test
	public void testCalcPrice() throws NullPointerException {

		assertTrue(c1.calcPrice() == 2.0);
		assertTrue(c2.calcPrice() == 3.5);
		assertTrue(c3.calcPrice() == 5.0);

	}
	
	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(c1.equals(c1) == true);
		assertTrue(c2.equals(c3) == false);
	}

}
