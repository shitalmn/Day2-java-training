package Assignment;

import java.util.*;    
class PizzaOrder{    
int id;    
String customerName;    
int pizzaQuantity; 
float price;
public PizzaOrder(int id, String customerName, int pizzaQuantity, float price) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.pizzaQuantity = pizzaQuantity;
	this.price = price;
}

   
}    
public class TreeMapTest {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,PizzaOrder> map=new TreeMap<Integer,PizzaOrder>();    
    //Creating Books    
    PizzaOrder b1=new PizzaOrder(101,"John",2,123.00f);    
    PizzaOrder b2=new PizzaOrder(104,"Jeniffer",1,163.00f);     
    PizzaOrder b3=new PizzaOrder(106,"akash",4,1236.00f);      
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer,PizzaOrder> entry:map.entrySet()){    
        int key=entry.getKey();  
        PizzaOrder b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.customerName+" "+b.pizzaQuantity+" "+b.price);   
    }    
}    
}    