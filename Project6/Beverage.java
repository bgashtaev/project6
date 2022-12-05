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

import java.util.Objects;

public abstract class Beverage {
	String name;
	Type type;
	Size size;
	
	final double price=2.0;
	final int sizePrice=1;
	
	public Beverage(String name, Type type, Size size) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public abstract double calcPrice();

	@Override
	public String toString() {
		return "Beverage:\nname:" + name + ", size:" + size ;
	}

	@Override
	public boolean equals(Object obj) {
		Beverage other = (Beverage) obj;
		return Objects.equals(name, other.name) && size == other.size && type == other.type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public int getSizePrice() {
		return sizePrice;
	}
	
	
	

}
