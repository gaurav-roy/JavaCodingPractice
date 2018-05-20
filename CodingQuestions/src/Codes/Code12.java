//Q.Take an integer input from user and count all prime numbers from 1 up to that number, print the total number of prime numbers
//as well as the largest one. E.g. if user presses 20, your program should print "Total number of prime numbers  are: 8".
//and "Largest prime number is: 19".

package Codes;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Num: ");
		int a = sc.nextInt();
		int count = 0, large = 0;
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
				large = i;
				System.out.println(i);
				isPrime = false;
			}
		}
		System.out.println("Number of Prime Nos. " + count + "    " + "Largest Prime number is " + large );
		

	}

}
