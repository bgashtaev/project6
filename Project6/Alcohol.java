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

public class Alcohol extends Beverage{

	boolean isWeekend;
	
	final double weekendPrice=0.6;
	public Alcohol(String name, Size size, boolean isWeekend) {
		super(name,Type.ALCOHOL,size);
		this.isWeekend=isWeekend;
	}

	@Override
	public double calcPrice() {
		double price=this.price;
		if(Size.MEDIUM==this.size) {
			price=this.price+1;
		}
		else if(Size.LARGE==this.size) {
			price=this.price+2;
		}
		if(isWeekend) {
			price+=weekendPrice;
		}
		return price;
	}

	@Override
	public String toString() {
		return "Alcohol: isWeekend=" + isWeekend + ", name=" + name + ", size=" + size + ", price=" + this.calcPrice();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alcohol other = (Alcohol) obj;
		return super.equals(obj) && isWeekend== other.isWeekend;
	}

	public boolean isWeekend() {
		return isWeekend;
	}

	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}
	
	

}
