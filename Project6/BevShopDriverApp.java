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

public class BevShopDriverApp {

	public static void main(String[] args) {
		System.out.println(BevShop.MAX_ORDER_FOR_ALCOHOL);
		System.out.println(BevShop.MIN_AGE_FOR_ALCOHOL);
		
		Customer customer=new Customer("John",23);
		BevShop shop=new BevShop();
		System.out.println("Start a new order");
		shop.startNewOrder(9, Day.THURSDAY, customer.getName(), customer.getAge());
		Order order=shop.getOrderAtIndex(0);
		
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		System.out.println(customer);
		System.out.println(shop.isValidAge(customer.getAge()));
		
		System.out.println("Add alcohol drink");
		shop.processAlcoholOrder("alcohol 1",Size.SMALL);
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		System.out.println(shop.isValidTime(10));
		System.out.println("Add second alcohol drink");
		shop.processAlcoholOrder("alcohol 2",Size.LARGE);
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		
		System.out.println(shop.getNumOfAlcoholDrink());
		
		System.out.println("Add third alcohol drink");
		shop.processAlcoholOrder("alcohol 3",Size.SMALL);
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		
		System.out.println(shop.getNumOfAlcoholDrink());
		
		if(shop.isEligibleForMore()==false) {
			System.out.println("Maximum alcohol drink for this order");
			
		}
		
		System.out.println("Add a coffee order");
		shop.processCoffeeOrder("coffee 1",Size.SMALL,true,true);
		System.out.println(shop.getNumOfAlcoholDrink());
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		System.out.println("Total on the Order:"+shop.totalOrderPrice(order.getOrderNumber()));
		
		
		System.out.println("Start a new order");
		shop.startNewOrder(9, Day.THURSDAY, customer.getName(), customer.getAge());
		System.out.println("Total on the Order:"+shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));
		System.out.println("Add a SMOOTHIE to order");
		shop.processSmoothieOrder("smoothie", Size.LARGE, 2, true);
		System.out.println("Total on the Order:"+shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));
		
		System.out.println("Add a coffee to order");
		shop.processCoffeeOrder("coffee", Size.SMALL, true, true);
		System.out.println("Total on the Order:"+shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));
		System.out.println(shop.getNumOfAlcoholDrink());
		
		Customer customer2=new Customer("John",12);
		if(shop.isValidAge(customer2.getAge())) {
			shop.processAlcoholOrder("alcohol 3",Size.SMALL);
			
		}
		else {
			System.out.println("Age not appropriate for alcohol drink");
		}
		
		if(shop.isMaxFruit(6)) {
			System.out.println("Max number of fruits");
		}
		else {
			shop.processSmoothieOrder("smoothie", Size.LARGE, 6, true);
			
		}
		shop.processSmoothieOrder("smoothie", Size.MEDIUM, 4, true);
		System.out.println();
		System.out.println("Total on the Order:"+shop.totalOrderPrice(shop.getCurrentOrder().getOrderNumber()));

		System.out.println("Total amount for all orders:"+shop.totalMonthlySale());


	}

}
