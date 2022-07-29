



import ExceptionFiles.LargeSizeJeansNotavailableException;
import ExceptionFiles.BeltColorNotAvailableException;
import ExceptionFiles.JeansIsNotAvailable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ass6thDayOutfit {
	public static void main(String[] args) {
		
		Cloth cloth = new Cloth("Linen",1,3000,"black");
		Top top = new Top("silk",2,4000,"red","silk",1,"purple");
		Jeans j = new Jeans("Black",28);
		Belt B = new Belt("Leather","White",26);
		
		Suite theSuite = top.make( j, B);
		
		System.out.println("Object created...");
		
		
		
		try {
			FileOutputStream fout  = new FileOutputStream("C:\\Users\\Student\\Desktop\\javas\\Day1\\src\\bank1.txt");
			System.out.println("File is ready...");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			System.out.println("Object stream is ready....");
			
			System.out.println("Trying to store the object...");
			oos.writeObject(cloth);
			oos.writeObject(top);
			oos.writeObject(j);
			oos.writeObject(B);
			oos.writeObject(theSuite);
			System.out.println("Object stored....");
			
			oos.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		

		
		
	   Cloth cloth1 =null;
		Top top1 = null;
		Jeans j1 = null;
		Belt B1 = null;
		Suite theSuite1 = null;
		System.out.println("Object is null...");
		
		try {
			FileInputStream fin  = new FileInputStream("C:\\Users\\Student\\Desktop\\javas\\Day1\\src\\bank1.txt");
			System.out.println("File is ready..for reading.....");
			
			ObjectInputStream ois = new ObjectInputStream(fin);
			System.out.println("Object stream is ready...for reading object.");
			
			System.out.println("Trying to retrieve the object...");
			cloth1 = (Cloth) ois.readObject();
			top1 = (Top) ois.readObject();
			j1 = (Jeans) ois.readObject();
			B1 = (Belt) ois.readObject();
			theSuite1 = (Suite) ois.readObject();
			System.out.println("Object retrieved....");
			
			System.out.println("cloth is : "+cloth1);
			System.out.println("jeans is : "+j1);
			System.out.println("belt is : "+B1);
			System.out.println("top is : "+top1);
			System.out.println("suite is : "+theSuite1);
			
			ois.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	
		
		
	}
}

class Cloth implements Serializable
{
	private String type;
	private int quantity;
	private transient int  amount;
	private String color;
	
	
	



	public Cloth(String type, int quantity, int amount, String color) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.amount = amount;
		this.color = color;
	}






	@Override
	public String toString() {
		return "Cloth [ type=" + type + ", quantity=" + quantity + ", amount=" + amount + ", color=" + color + "]";
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

class Top extends Cloth implements Serializable
{
	private String topType;
	private transient int topQuantity;
	private String topColor;
	
	

	public Top(String type, int quantity, int amount, String color, String topType, int topQuantity, String topColor) {
		super(type, quantity, amount, color);
		this.topType = topType;
		this.topQuantity = topQuantity;
		this.topColor = topColor;
	}



	


	@Override
	public String toString() {
		return "Top [toString()=" + super.toString() + ", topType=" + topType + ", topColor=" + topColor + "]";
	}






	Suite make(Jeans j, Belt B)
	{
		if(j==null)
		{
			
			JeansIsNotAvailable jeansNotAvailableEx = new JeansIsNotAvailable("Jeans is  missing to make suite");
			throw jeansNotAvailableEx;
		}
		  System.out.println("For suit making we required top and jeans");
		  System.out.println("In suit top is of" + topType + "type and quantity of top is"+topQuantity);
		  System.out.println("In suit jeans is of"+ j.getColor()+ "and of size" + j.getSize());
		  System.out.println("for jeans we required belt is of type " + B.getType() + "and color is" + B.getColor() +"and of size" + B.getSize());
		  Suite suite = new Suite(5000,2);
		  return suite;
	}
}
class Jeans implements Serializable
{
	
	private String color;
	private int size;
	public Jeans(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	

	if(size>34)
	{
		LargeSizeJeansNotavailableException largeJeansEx = new LargeSizeJeansNotavailableException("Only 28,30,32 and 34 size jeans are available............Large size jeans are not available....");
		throw largeJeansEx;
	}
	
	
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}

class Belt implements Serializable
{
	private String type;
	private String color;
	private int size;
	public Belt(String type, String color, int size) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
		
	/*	if(this.color!="Black" || this.color!="Brown" || this.color!="White")
		{
			BeltColorNotAvailableException beltColorEx = new BeltColorNotAvailableException ("Only Black,Brown and White belts are available............");
			throw beltColorEx;
		}*/
	}
	@Override
	public String toString() {
		return "Belt [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
class Suite implements Serializable
{
	private transient int sAmount;
	private int squantity;
	private int totalCost;
	public Suite(int sAmount, int squantity) {
		super();
		this.sAmount = sAmount;
		this.squantity = squantity;
		this.totalCost = sAmount * squantity;
	}
	
	
	@Override
	public String toString() {
		return "Suite [sAmount=" + sAmount + ", squantity=" + squantity + ", totalCost=" + totalCost + "]";
	}


	void printSuiteCost() {
		System.out.println("Total Cost of Suite " + totalCost);
	}
	
	}

//book class - author, no, edition, no of pages, book price

//innovate comparator interface with ur uniquelly designed object

//innovate treemap
// serialize this books via hashset


	void printCloth()
	{
		System.out.println("---------cloth Info-------------");
		System.out.println("cloth type"+type);
		System.out.println("cloth color"+color);
		System.out.println("cloth quantity"+quantity);
		System.out.println("cloth amount"+ amount);
		
	}
	

}

class Top extends Cloth implements Serializable
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



	@Override
	public String toString() {
		return "Top [topType=" + topType + ", topQuantity=" + topQuantity + ", topColor=" + topColor + ", type=" + type
				+ ", quantity=" + quantity + ", amount=" + amount + ", color=" + color + "]";
	}



	Suite make(Jeans j, Belt B)
	{
		if(j==null)
		{
			
			JeansIsNotAvailable jeansNotAvailableEx = new JeansIsNotAvailable("Jeans is  missing to make suite");
			throw jeansNotAvailableEx;
		}
		  System.out.println("For suit making we required top and jeans");
		  System.out.println("In suit top is of" + topType + "type and quantity of top is"+topQuantity);
		  System.out.println("In suit jeans is of"+ j.color+ "and of size" + j.size);
		  System.out.println("for jeans we required belt is of type " + B.type + "and color is" + B.color +"and of size" + B.size);
		  Suite suite = new Suite(5000,2);
		  return suite;
	}
}
class Jeans implements Serializable
{
	
	String color;
	int size;
	public Jeans(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	

	if(size>34)
	{
		LargeSizeJeansNotavailableException largeJeansEx = new LargeSizeJeansNotavailableException("Only 28,30,32 and 34 size jeans are available............Large size jeans are not available....");
		throw largeJeansEx;
	}
	
	
	}
	@Override
	public String toString() {
		return "Jeans [color=" + color + ", size=" + size + "]";
	}
	
}

class Belt implements Serializable
{
	String type;
	String color;
	int size;
	public Belt(String type, String color, int size) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
		
	/*	if(this.color!="Black" || this.color!="Brown" || this.color!="White")
		{
			BeltColorNotAvailableException beltColorEx = new BeltColorNotAvailableException ("Only Black,Brown and White belts are available............");
			throw beltColorEx;
		}*/
	}
	@Override
	public String toString() {
		return "Belt [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	
}
class Suite implements Serializable
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
	
	
	@Override
	public String toString() {
		return "Suite [sAmount=" + sAmount + ", squantity=" + squantity + ", totalCost=" + totalCost + "]";
	}


	void printSuiteCost() {
		System.out.println("Total Cost of Suite " + totalCost);
	}
	
	}

