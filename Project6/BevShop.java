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

import java.util.ArrayList;

public class BevShop implements BevShopInterface{

	ArrayList<Order> orders;
	int currentOrder=-1;
	
	public BevShop() {
		super();
		orders=new ArrayList<Order>();
	}

	@Override
	public boolean isValidTime(int time) {
		if(time>=BevShop.MIN_TIME && time<=BevShop.MAX_TIME) {
			return true;
		}
		return false;
	}

	@Override
	public int getMaxNumOfFruits() {
		return BevShop.MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		return BevShop.MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		if(numOfFruits>BevShop.MAX_FRUIT) {
			return true;
		}
		return false;
	}

	@Override
	public int getMaxOrderForAlcohol() {
		return BevShop.MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() {
		if(this.getNumOfAlcoholDrink()==BevShop.MAX_ORDER_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public int getNumOfAlcoholDrink() {
		Order order=this.getCurrentOrder();
		int count=order.findNumOfBeveType(Type.ALCOHOL);
		return count;
	}

	@Override
	public boolean isValidAge(int age) {
		if(age> BevShop.MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer customer=new Customer(customerName, customerAge);
		Order order=new Order(time,day,customer);
		orders.add(order);
		currentOrder++;
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.getCurrentOrder().addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		this.getCurrentOrder().addNewBeverage(bevName, size);
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		this.getCurrentOrder().addNewBeverage(bevName, size, numOfFruits, addProtein);
	}

	@Override
	public int findOrder(int orderNo) {
		int id=-1;
		for(int i=0;i<orders.size();i++) {
			if(orders.get(i).getOrderNumber()==orderNo) {
				id=i;
				break;
			}
		}
		return id;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		int id=this.findOrder(orderNo);
		if(id!=-1) {
			return orders.get(id).calcOrderTotal();
		}
		return 0.0;
	}

	@Override
	public double totalMonthlySale() {
		double total=0;
		for(int i=0;i<orders.size();i++) {
			total+=orders.get(i).calcOrderTotal();
		}
		return total;
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		return orders.get(currentOrder);
	}

	@Override
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}

	@Override
	public void sortOrders() {
		int n = orders.size();
		
        for (int i = 0; i < n-1; i++)
        {
           
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (orders.get(j).compareTo(orders.get(min_idx))==-1)
                    min_idx = j;
 
            Order order = orders.get(min_idx);
            orders.set(min_idx, orders.get(i));
            orders.set(i, order);
        }
		
	}

}
