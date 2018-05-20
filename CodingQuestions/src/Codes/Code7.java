//Q.USing for loop, print the result of multiplication of all odd numbers from 1 to 20 and the result of sum of all even numbers from 1 to 100.
package Codes;

public class Code7 {

	public static void main(String[] args) {
		
		int even = 0, odd = 1;
		for(int i = 1; i <= 20; i+=2) {
			odd = odd * i;
		}
		for(int i = 2; i <= 100; i+=2) {
			even = even + i;
		}
		System.out.println("Even: " + even + " Odd: " + odd);
		 

	}

}
