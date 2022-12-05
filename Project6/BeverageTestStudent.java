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
public class BeverageTestStudent {
	Beverage s1,s2,a1,c1 ;

	@Before
	public void setUp() throws Exception {
		s1 =new Smoothie("Detox", Size.MEDIUM, 1, false);
		a1 = new Alcohol("Mohito1", Size.MEDIUM, false);
		s2 = new Smoothie("Detox", Size.MEDIUM, 1, false);
		c1 = new Coffee("regular Coffee", Size.SMALL, false, false);
		
	}

	@After
	public void tearDown() throws Exception {
		s1=s2=a1=c1 = null;
	}

	
	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(s1.equals(s2) == true);
		assertTrue(s2.equals(a1) == false);
		assertTrue(a1.equals(c1) == false);
	}

}
