//Q.Send an integer to a function and count the digit 5 in an integer. E.g.-1523525, then the result is 3.
package RecursionProblems;

public class Problem8 {

	public static void main(String[] args) {
		
		System.out.println("Counting 5: " + count5(1525354));

	}
	public static int count5(int num) {
		if(num <= 9) {
			if(num == 5) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if(num % 10 == 5) {
				return 1 + count5(num / 10);
			}else {
				return 0 + count5(num / 10);
			}
		}
	}
	

}
