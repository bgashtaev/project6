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
public class CustomerTestStudent {
	Customer c1,c2,c3;

	@Before
	public void setUp() throws Exception {
		c1 =new Customer("John", 20);
		c2 =new Customer("Mike", 13);
		c3 = new Customer(c2);
	}

	@After
	public void tearDown() throws Exception {
		c1=c2=c3 = null;
	}

	@Test
	public void testEquals() throws NullPointerException {

		assertTrue(c3.getName().equals(c2.getName()) == true);
		assertTrue(c3.getAge() == c2.getAge());
		assertTrue(c1.getName().equals(c2.getName()) == false);
	}

}
