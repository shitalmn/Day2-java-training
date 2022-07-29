package Assignment;


import java.util.*;  
import java.io.*;  
  
class CollectionSortTest{  
public static void main(String args[]){  
  
ArrayList<Metal1> al=new ArrayList<Metal1>();  
al.add(new Metal1("Iron",230));  
al.add(new Metal1("Gold",25000));  
al.add(new Metal1("Silver",700));  
  
System.out.println("Sorting metal  by price");  
  
Collections.sort(al,new Metal());  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Metal1 st=(Metal1)itr.next();  
System.out.println(st.metalName+" "+st.metalValuePerGram);  
}  
  

}  
}
class Metal implements Comparator<Metal1>
{
	
	

	@Override
	public int compare(Metal1 o1, Metal1 o2) {
		Metal1 m1 = (Metal1)o1;
		Metal1 m2 = (Metal1)o2;
	
		
		System.out.println("comparing"+m1.metalValuePerGram+"with"+m2.metalValuePerGram);
		return Integer.compare(m1.metalValuePerGram, m2.metalValuePerGram);
	}
}

class Metal1
{
	String metalName;
	int metalValuePerGram;
	public Metal1(String metalName, int metalValuePerGram) {
		super();
		this.metalName = metalName;
		this.metalValuePerGram = metalValuePerGram;
	}
}

