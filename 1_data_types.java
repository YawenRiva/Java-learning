/* Type Variable = Value;
 * PRIMITIVE & NON-PRIMITIVE DATA TYPE
 * (LowerCase)Primitive types are already defined in Java -- always a value
 * (UpperCase)Non-primitive types are created by the programmer and is not defined by Java -- can be NULL
 * eg(non-pri). Strings, Arrays, Classes, Interface
*/
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

	char letter = 'A';
	System.out.println(letter);
		
        String words = "AB";
        System.out.println(words);
	}
	// to combine both text and a variable, use the + character
	// output = John
	String name = "John";
	System.out.println("Hello " + name);
	// add variable to another variable
	// output = John Doe
	String firstName = "John ";
	String lastName = "Doe";
	String fullName = firstName + LastName;
	System.out.println(fullName);
	
	// Declare Many Variables
	// declare more than one variable of the same type
	int x = 5, y = 6, z = 50;
	System.out.println(x + y + z);
}
