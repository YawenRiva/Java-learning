public class Strings {
  public static void main(String[] args) {
      // String = contains a collection of characters surrrounded by DOUBLE QUOTES
      String greeting = "Hello";
    
      /* a String in Java is an object
       * which contain methods that can perform certain operations on strings
       * length() example
      */
      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println("The length of the txt tring is: " + txt.length());
    
      // String methods: toUpperCase() and toLowerCase()
      String txt = "Hello World";
      System.out.println(txt.toUpperCase());
      // output = HELLO WORLD
      System.out.println(txt.toLowerCase());
      // output = hello world
    
      /* indexOf() method returns the INDEX(position) of the first occurrence of a 
       * specified text in a string including white space
      */
      String txt = "Please locate where 'locate' occurs!";
      System.out.println(txt.indexOf("locate"));
    
      /* String Concatenation
       * the + operator can be used between strings to add them together to make a new string
      */
      String firstName = "John";
      String lastName = "Doe";
      System.out.println(firstName + " " + lastName);
      // or we can use the concat() method
      // this method doesnt contains the space between word
      // so the output would be JohnDoe
      String firstName = "John ";
      String lastName = "Doe";
      System.out.println(firstName.concat(lastName));
      
      // Java will MISUNDERSTAND!! the following string
      String txt = "We are the so-called "Vikings" from the north.";
      /* SOLUTION: use "backslash escape character"
       * the backslash(\) escape character turns special characters into string characters
       * (\') = (') and (\") = (") and (\\) = (\)
      */
      String txt = "We are the so-called \"Vikings\" from the north.";
      String txt = "It\'s alright.";
        
      // (\n) new line
      // output = Hello
      //          World!
      String txt = "Hello\nWorld!";
      System.out.println(txt);
    
      // (\r) carriage return
      // same output value as the previous new line method
      String txt = "Hello\rWorld!";
      System.out.println(txt);
    
      // (\t) tab
      // output = Hello    World!
    
      // (\b) backspace
      // output = Helo World!
      String txt = "Hel\blo World!";
      System.out.println(txt);
  }
}
