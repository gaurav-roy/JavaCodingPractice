//Q. Take two numbers from user and print the result of multiplication and sum of all the numbers between these numbers.
//E.g. if user presses 3 and 8 the 4+5+6+7 is 22 and 4*5*6*7 is 840. Restrict the user that the first number must be less than second number.

package Codes;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1: ");
		int a = sc.nextInt();
		System.out.println("Num2: ");
		int b = sc.nextInt();
		int sum = 0, mul = 1;
		if(a < b) {
			for(int i = a+1; i < b; i ++){
				sum = sum + i;
				mul = mul * i;
				
			}
			System.out.println("Sum: " + sum + "   Mul: " + mul );
		}

	}

}
