//Q.Using do while loop print the numbers of digits this number contains.
package Codes;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 1, q = a/10;
		
		do {
			q = q/10;
			
			result++;
			
		}while(q != 0);
		
		System.out.println(result);
		
		
		

	}

}
