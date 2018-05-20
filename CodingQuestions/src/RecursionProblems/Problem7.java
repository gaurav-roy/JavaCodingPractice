//Q.Send an integer to a function and return the sum of all digits of that number e.g.123,then the result is 1+2+3=6.
//SO,321 % 10 IS 1. while divide(/)by 10 removes the rightmost digit(321/10 is 32).
package RecursionProblems;

public class Problem7 {

	public static void main(String[] args) {
		
		System.out.println("Sum of digits: " + sum(635));
	
	}
	public static int sum(int num) {
		if(num<= 9) {
			return num;
		}else {
			return num % 10 + sum(num / 10);
		}
	}

}
