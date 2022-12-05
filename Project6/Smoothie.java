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

public class Smoothie extends Beverage{
	int numFruits;
	boolean isProteinpowderAdded;
	
	final double fruitPrice=0.5;
	final double protienPrice=1.5;
	

	public Smoothie(String name, Size size, int fruitsCount, boolean isProteinpowderAdded) {
		super(name, Type.SMOOTHIE, size);
		this.numFruits=fruitsCount;
		this.isProteinpowderAdded=isProteinpowderAdded;
	}


	@Override
	public String toString() {
		return "Smoothie: numFruits=" + numFruits + ", isProteinpowderAdded=" + isProteinpowderAdded + ", name=" + name
				+ ", size=" + size + ", price=" + this.calcPrice();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smoothie other = (Smoothie) obj;
		return super.equals(obj) && isProteinpowderAdded == other.isProteinpowderAdded && numFruits == other.numFruits;
	}
	


	@Override
	public double calcPrice() {
		double price=this.price;
		if(Size.MEDIUM==size) {
			price=this.price+1;
		}
		else if(Size.LARGE==size) {
			price=this.price+2;
		}
		
		if(isProteinpowderAdded) {
			price+=protienPrice;
		}
		price+=(numFruits*fruitPrice);
		return price;
	}


	public int getNumFruits() {
		return numFruits;
	}


	public void setNumFruits(int numFruits) {
		this.numFruits = numFruits;
	}


	public boolean isProteinpowderAdded() {
		return isProteinpowderAdded;
	}


	public void setProteinpowderAdded(boolean isProteinpowderAdded) {
		this.isProteinpowderAdded = isProteinpowderAdded;
	}
	
	
	

}
