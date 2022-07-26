

public class Outfit {
	public static void main(String[] args) {
		
		Cloth cloth = new Cloth("Linen",1,3000,"black");
		cloth.printCloth();
		
		Top top = new Top("silk",2,4000,"red","silk",1,"purple");
		Jeans j = new Jeans("Black",28);
		Belt B = new Belt("Leather","white",26);
		
		Suite theSuite = top.make( j, B);
	   theSuite.printSuiteCost();
		
		
		
		
	}
}

class Cloth
{
	String type;
	int quantity;
	int amount;
	String color;
	
	
	



	public Cloth(String type, int quantity, int amount, String color) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.amount = amount;
		this.color = color;
	}






	void printCloth()
	{
		System.out.println("---------cloth Info-------------");
		System.out.println("cloth type"+type);
		System.out.println("cloth color"+color);
		System.out.println("cloth quantity"+quantity);
		System.out.println("cloth amount"+ amount);
		
	}
	

}

class Top extends Cloth
{
	String topType;
	int topQuantity;
	String topColor;
	
	

	public Top(String type, int quantity, int amount, String color, String topType, int topQuantity, String topColor) {
		super(type, quantity, amount, color);
		this.topType = topType;
		this.topQuantity = topQuantity;
		this.topColor = topColor;
	}



	Suite make(Jeans j, Belt B)
	{
		  System.out.println("For suit making we required top and jeans");
		  System.out.println("In suit top is of" + topType + "type and quantity of top is"+topQuantity);
		  System.out.println("In suit jeans is of"+ j.color+ "and of size" + j.size);
		  System.out.println("for jeans we required belt is of type " + B.type + "and color is" + B.color +"and of size" + B.size);
		  Suite suite = new Suite(5000,2);
		  return suite;
	}
}
class Jeans
{
	
	String color;
	int size;
	public Jeans(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}
	
	
}

class Belt
{
	String type;
	String color;
	int size;
	public Belt(String type, String color, int size) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
	}
}
class Suite
{
	int sAmount;
	int squantity;
	int totalCost;
	public Suite(int sAmount, int squantity) {
		super();
		this.sAmount = sAmount;
		this.squantity = squantity;
		this.totalCost = sAmount * squantity;
	}
	
	void printSuiteCost() {
		System.out.println("Total Cost of Suite " + totalCost);
	}
	
	}
