// break statement can be used to jump out of a loop
// continue statement breaks one iteration (in the loop)
// if a specified condiion occurs and continues with the next iteration in the loop
public class Forloop {
    public static void main(String[] args) {
        // output = 0 1 2 3 4
        // because when/if i equals to 5, break/jump out
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        
        // output = 0 1 2 3 4 6 7 8 9
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
      
        // while loop example
        // output = 0 1 2 3
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) break;
        }
      
        // while loop continue example
        int i = 0;
        while (i < 10) {
            if (i == 6) {
                // to the next iteration
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
