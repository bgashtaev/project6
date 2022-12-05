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
public class DayTestStudent {

	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(Day.WEDNESDAY.ordinal() !=3);
		assertEquals("SATURDAY", Day.SATURDAY.toString());
		assertTrue(Day.MONDAY.ordinal() == 0);
	}
}

