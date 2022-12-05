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

public class Order implements OrderInterface, Comparable<Order>{

	private int orderNumber;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	ArrayList<Beverage> beverages;
	Order(int orderTime, Day orderDay, Customer cust){
		this.orderTime=orderTime;
		this.orderDay=orderDay;
		this.customer=cust;
		beverages=new ArrayList<Beverage>();
		this.orderNumber=this.generateOrder();
	}
	 
	@Override
	public boolean isWeekend() {
		if(orderDay==Day.SATURDAY || orderDay==Day.SUNDAY) {
			return true;
		}
		return false;
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		Beverage beverage=beverages.get(itemNo);
		return beverage;
	}

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee cf = new Coffee(bevName, size, extraShot, extraSyrup);
		
		beverages.add(cf);
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		Alcohol al = new Alcohol(bevName, size, this.isWeekend());
		beverages.add(al);
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Smoothie smoothie=new Smoothie(bevName,size,numOfFruits,addProtein);
		
		beverages.add(smoothie);
		
	}

	@Override
	public double calcOrderTotal() {
		double total=0;
		for(int i=0;i<beverages.size();i++) {
			total+=beverages.get(i).calcPrice();
		}
		return total;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		int count=0;
		for(int i=0;i<beverages.size();i++) {
			if(beverages.get(i).getType()==type) {
				count++;
			}
		}
		return count;
	}
	
	private int generateOrder() {
		int num = (int)(Math.random()*(80000+1)+10000); 
		return num;
	}

	@Override
	public String toString() {
		return "Order #" + orderNumber + "\norderTime:" + orderTime + "\norderDay:" + orderDay
				+ "\ncustomer:" + customer + "\nbeverages=" + beverages + "]";
	}

	@Override
	public int compareTo(Order o) {
		if(this.orderNumber==o.orderNumber) {
			return 0;
		}
		else if(this.orderNumber>o.orderNumber) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	public Day getOrderDay() {
		return orderDay;
	}

	public void setOrderDay(Day orderDay) {
		this.orderDay = orderDay;
	}

	public Customer getCustomer() {
		Customer newCustomer=new Customer(this.customer);
		return newCustomer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}

	public void setBeverages(ArrayList<Beverage> beverages) {
		this.beverages = beverages;
	}

	public int getTotalItems() {
		return this.beverages.size();
	}

}
