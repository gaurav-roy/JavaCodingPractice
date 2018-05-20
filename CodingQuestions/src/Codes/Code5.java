//Q.Write a code that inputs 10 different integers within a while loop and displays the largest as well as smallest. 
package Codes;

import java.util.Scanner;

public class Code5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i =2, small=0, large=0;
		
		System.out.print("Num 1: ");
		int a = sc.nextInt();
		small = a;
		large = a;
		
		while(i<=10) {
			System.out.print("Num " + i + ": ");
			int b =sc.nextInt();
			if(b < small) {
				small= b;
			}
			if(b >  large) {
				large = b;
			}
		i++;
		}
		System.out.print("Larger " + large + " Smaller  " + small  );
		

	}

}
