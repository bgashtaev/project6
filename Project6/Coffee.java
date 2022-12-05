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

public class Coffee extends Beverage{
	boolean extraShot;
	boolean extraSyrup;
	
	final double extraShotPrice=0.5;
	final double extraSyrupPrice=0.5;

	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName,Type.COFFEE,size);
		this.extraSyrup=extraSyrup;
		this.extraShot=extraShot;
		
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
		
		if(extraShot) {
			price+=extraShotPrice;
		}
		if(extraSyrup) {
			price+=extraSyrupPrice;
		}
		return price;
	}

	@Override
	public String toString() {
		return "Coffee: extraShot=" + extraShot + ", extraSyrup=" + extraSyrup + ", name=" + name + ", size=" + size
				+ ", price=" + this.calcPrice();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return super.equals(obj) && extraShot == other.extraShot && extraSyrup == other.extraSyrup;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public boolean isExtraSyrup() {
		return extraSyrup;
	}

	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}
	
	
	
	

}
