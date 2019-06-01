
public class var_types {
	public static void main(String[] args) {
		
		
		int a = 10000;
		// the following shows the difference between print and println
		System.out.print(a);
		// doesnt goes to new line, if no line 6, the result would be 1000010000
		System.out.print("\n");
		System.out.println(a);
		// after print out the variable, it goes to a new line automatically
		// the max and min value of the INT type
		System.out.println("TYPE: int, SIZE = " + Integer.SIZE); 
		System.out.println("MAX_value: Integer.MIN_VALUE = " + Integer.MIN_VALUE);  
        System.out.println("MIN_value: Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
	
        
        
        byte b = -50;
        System.out.println(b);
        System.out.println("TYPE: byte, SIZE = " + Byte.SIZE); 
		System.out.println("MAX_value: Byte.MIN_VALUE = " + Byte.MIN_VALUE);  
        System.out.println("MIN_value: Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        
        
        
        short s = 1000;
        System.out.println(s);
        System.out.println("TYPE: short, SIZE = " + Short.SIZE); 
  		System.out.println("MAX_value: Short.MIN_VALUE = " + Short.MIN_VALUE);  
        System.out.println("MIN_value: Short.MAX_VALUE = " + Short.MAX_VALUE);
	
	
	
        long l = 1000000L;
        System.out.println(l);
        
        
        
        float f = 100.29f;
        System.out.println(f);
        
        
        
        double d = 399.223d;
        System.out.println(d);
        
        
        
        boolean bo = true;
        System.out.println(bo);
        
        
        String letter = "AB";
        System.out.println(letter);
	}
}
