public class If_statement {
  public static void main(String[] args) {
    // output = 20 is greater than 18
    if (20 > 18) {
      System.out.println("20 is greater than 18");
    }
    
    // then we can test variables
    // output = x is greater than y
    int x = 20, y = 18;
    if (x > y) {
      System.out.println("x is greater than y");
    }
    
    // if statements with else statement
    // output = Good evening.
    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    
    // else if condition include
    // output = Good evening.
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 20) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    
    
    /* Short Hand IF...ELSE (ternary operator)
     * if only have one statement to execute
     * one for IF, and one for ELSE, can put them all to the same line:
     * variable = (condition) ? expressionTrue : expressionFalse;
    */
    // for the example from line 15-22 we can express it by another way:
    int time = 20;
    String result = (time < 10) ? ("Good day.") : ("Good evening.");
    System.out.println(result);
    
  }
}


















