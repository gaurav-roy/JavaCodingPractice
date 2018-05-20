//Q.Fibonacci series: 0,1,1,2,3,5,8,13,21.......
package RecursionProblems;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println("Fibonacci: " + fibonacci(7));

	}
	public static int fibonacci(int num) {
		if(num == 0) {
			return 0;
		}if(num == 1) {
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}

}
