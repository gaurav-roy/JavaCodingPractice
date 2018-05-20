//Q. Find Factorial of any number.
package RecursionProblems;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println("Factorial: " + factorial(5));

	}
	
	public static int factorial(int num) {
		
		if(num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}

}
