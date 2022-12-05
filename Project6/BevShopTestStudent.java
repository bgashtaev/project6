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
public class BevShopTestStudent {
	BevShop shop;
	Customer c1,c2;

	@Before
	public void setUp() throws Exception {
		shop=new BevShop();
		c1 =new Customer("John", 23);
		c2 =new Customer("Mike", 13);

	}

	@After
	public void tearDown() throws Exception {
		c1=c2= null;
	}

	@Test
	public void AllTests() throws NullPointerException {

		assertTrue(BevShop.MAX_ORDER_FOR_ALCOHOL == 3);
		assertTrue(BevShop.MIN_AGE_FOR_ALCOHOL==21);
		
		shop.startNewOrder(9, Day.THURSDAY, c1.getName(), c1.getAge());
		Order order=shop.getOrderAtIndex(0);
		
		assertTrue(shop.totalOrderPrice(order.getOrderNumber())==0.0);
		assertTrue(shop.isValidAge(13)==false);
		assertTrue(shop.isValidAge(25)==true);
		assertTrue(shop.isMaxFruit(6)==true);
		
		shop.processAlcoholOrder("alcohol 1",Size.SMALL);
		assertTrue(shop.isEligibleForMore()==false);
		assertTrue(shop.getNumOfAlcoholDrink()==1);
		assertTrue(shop.totalMonthlySale()==2.0);
		assertTrue(shop.totalNumOfMonthlyOrders()==1);

	}
	
}
