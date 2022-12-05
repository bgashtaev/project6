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
public class SmoothieTestStudent {
	Smoothie s1,s2,s3 ;

	@Before
	public void setUp() throws Exception {
		s1 =new Smoothie("Detox", Size.MEDIUM, 1, false);
		
		s2 = new Smoothie("Detox", Size.MEDIUM, 4, true);
		s3 =new Smoothie("Detox", Size.LARGE, 1,true);
		
	}

	@After
	public void tearDown() throws Exception {
		s1=s2=s3 = null;
	}

	@Test
	public void testCalcPrice() throws NullPointerException {

		assertTrue(s1.calcPrice() == 3.5);
		assertTrue(s2.calcPrice() == 6.5);
		assertTrue(s3.calcPrice() == 6.0);

	}
	
	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(s1.equals(s1) == true);
		assertTrue(s2.equals(s3) == false);
	}

}
