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
public class OrderTestStudent {
	Order o1,o2 ;
	Customer c1,c2;

	@Before
	public void setUp() throws Exception {
		c1 =new Customer("John", 20);
		c2 =new Customer("Mike", 13);
		o1=new Order(11,Day.WEDNESDAY,c1);
		o2=new Order(1,Day.SATURDAY,c2);
		
		o1.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		o1.addNewBeverage("Mohito", Size.SMALL);
	
	}

	@After
	public void tearDown() throws Exception {
		c1=c2= null;
		o1=o2 = null;
	}

	@Test
	public void testisWeekend() throws NullPointerException {

		assertTrue(o1.isWeekend() == false);
		assertTrue(o2.isWeekend() == true);
	}
	@Test
	public void testOrderTotal() throws NullPointerException {

		assertTrue(o1.calcOrderTotal() == 4.0);
	}
	
	@Test
	public void testfindNumOfBeveType() throws NullPointerException {

		assertTrue(o1.findNumOfBeveType(Type.ALCOHOL) == 1);
	}
	
}
