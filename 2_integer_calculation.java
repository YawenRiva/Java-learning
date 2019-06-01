

public class int_calc {
	public static void main(String[] args) {
		// CALCULATION of integers
		
		// PART 1
		/* + add/plus
		 * - minus
		 * * times/multiply
		 * % mod
		 */
		System.out.println(233/2);
		// the output would be integer if its the calculation of integers
		// 116.5 is the result, the output is 116 which keeps only the integer part
		System.out.println(10.2/2);
		// however if the calculation contains float/double... would have the 5.1 result as the output
		System.out.println(233*2);
		System.out.println(233+2);
		System.out.println(233%2);
		
		
		
		
		// PART 2
		// = += -= *= /= %= ++ --
		
		int a = 5;
		// a = a + 5;
		// or we can use a++
		a += 5;
		System.out.println(a);
		
		int b = 5;
		b -= 5;
		// same as b = b - 5;
		// or we can use b--
		System.out.println(b);
		
		// a *= 5 is same as a = a * 5
		// a /= 5 is same as a = a / 5
		// a %= 5 is same as a = a % 5
		
		
		
		// PART3 : switch the value of two variables
		int a1 = 1;
		int a2 = 2;
		int temp;
		temp = a1;
		a1 = a2;
		// a2 = a1;
		a2 = temp;
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
	}
}
