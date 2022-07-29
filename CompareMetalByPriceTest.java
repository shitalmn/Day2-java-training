package Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CompareMetalByPriceTest {

	public static void main(String[] args) {
		System.out.println("Creating the Metal content....");
		Metals m1 = new Metals("Silver",1000);
		Metals m2 = new Metals("Gold",50000);
		Metals m3 = new Metals("Iron",600);
		
		
		System.out.println("Content is creaeted....");
		
		System.out.println("Creating container....");
		TreeSet<Metals> metalEle = new TreeSet<Metals>();
		System.out.println("Container is ready....");
		
		System.out.println("Adding the 1 metal....");
		metalEle.add(m1);
		
		System.out.println("Adding the 2 metal....");
		metalEle.add(m2);
			
		System.out.println("Adding the 3 metal....");
		metalEle.add(m3);
		
		
		
		System.out.println("---> Now iterating over the container <---");
		
		for (Metals metals : metalEle) {
			System.out.println("Metals  "+metals);
		}
	}
	
		
}

class Metals implements Comparable<Metals>
{
	String metalName;
	int metalValuePerGram;
	public Metals(String metalName, int metalValuePerGram) {
		super();
		this.metalName = metalName;
		this.metalValuePerGram = metalValuePerGram;
	}
	@Override
	public String toString() {
		return "Metals [metalName=" + metalName + ", metalValuePerGram=" + metalValuePerGram + "]";
	}
	@Override
	public int compareTo(Metals o) {
		System.out.println("comparing"+metalValuePerGram+"with"+o.metalValuePerGram);
		return Integer.compare(metalValuePerGram, o.metalValuePerGram);
	}

	

	
	
	
	

}