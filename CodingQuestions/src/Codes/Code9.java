//Q.Take an integer input  from the user, print YES if it is prime number and NO if it not a prime number.
package Codes;

import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isPrime = true;
		System.out.print("Result: ");
		
		for(int i = 2; i < a/2; i++) {
			
			if(a % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
			
		
		

	}

}
