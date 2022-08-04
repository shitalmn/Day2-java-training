
public class DataTypeTest {
    public static void main(String[] args) {
		
    	//-128 to 127
    	byte b = -128;
    	
    	System.out.println("b is " +b);
    	System.out.println("min value for a byte "+Byte.MIN_VALUE);
    	System.out.println("max value for a byte "+Byte.MAX_VALUE);
    	System.out.println("size a byte  "+Byte.SIZE+" bits");
    	System.out.println("-------------------------");
    	
    	short s = 228;
    	
    	System.out.println("s is " +s);
    	System.out.println("min value for a short "+Short.MIN_VALUE);
    	System.out.println("max value for a short "+Short.MAX_VALUE);
    	System.out.println("size a short  "+Short.SIZE+" bits");
    	System.out.println("-------------------------");
    	
    	
    	int i = 123228;
    	
    	System.out.println("i is " +i);
    	System.out.println("min value for a Integer "+Integer.MIN_VALUE);
    	System.out.println("max value for a Integer "+Integer.MAX_VALUE);
    	System.out.println("size a Integer  "+Integer.SIZE+" bits");
    	System.out.println("-------------------------");
    	
    	
    	long l  = 13223228;
    	
    	System.out.println("l is " +l);
    	System.out.println("min value for a Long "+Long.MIN_VALUE);
    	System.out.println("max value for aLong "+Long.MAX_VALUE);
    	System.out.println("size a Long  "+Long.SIZE+" bits");
    	System.out.println("-------------------------");
    	
    	float f  = 13223228.34F;
    	
    	System.out.println("f is " +f);
    	System.out.println("min value for a Float "+Float.MIN_VALUE);
    	System.out.println("max value for a Float "+Float.MAX_VALUE);
    	System.out.println("size a Float  "+Float.SIZE+" bits");
    	System.out.println("-------------------------");
    	
    	
    
    	 double d = 3.14;
    	System.out.println("d is " +d);
    	System.out.println("min value for a Double "+Double.MIN_VALUE);
    	System.out.println("max value for a Double "+Double.MAX_VALUE);
    	System.out.println("size a Double "+Double.SIZE+" bits");
    	System.out.println("-------------------------");
	}
}
