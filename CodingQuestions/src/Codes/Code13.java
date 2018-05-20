package Codes;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Num: ");
		int a = sc.nextInt();
		int count = 0, sum = 0;
		boolean isPrime = true;
		for(int i =1; i < a; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && i != 0) {
				count++;
				sum = sum + i;
				System.out.println(i);
				isPrime = false;
			}
		}
		
		System.out.println("Number of Prime Nos. " + count + "    " + "Sum of Prime numbers are " + sum );


	}

}
