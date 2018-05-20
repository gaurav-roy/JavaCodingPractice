//Q. Print number from any number to 1.

package RecursionProblems;

public class Problem1 {

	public static void main(String[] args) {
		//1.print numbers
		printNumbers(5);
		
		
	}
	public static void printNumbers(int num) {
		if(num == 0) {
			return;
		}else {
			System.out.println(num);
			printNumbers(num - 1);
		}
	}

}
