//Q.Find power by sending base and power value to a function.
package RecursionProblems;

public class Problem3 {

	public static void main(String[] args) {
		
		System.out.println("Power: " + power(2,3));

	}
	
	public static int power(int base, int num) {
		if(num == 1) {
			return base;
		}else {
			return base * power(base, num - 1);
		}
	}

}
