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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class SizeTestStudent {

	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(Size.LARGE.ordinal() == 2);
		assertTrue(Size.MEDIUM.ordinal() == 1);
		assertTrue(Size.SMALL.ordinal()!=2);
		assertEquals("SMALL", Size.SMALL.toString());
	}
}
