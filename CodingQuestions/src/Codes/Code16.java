//Q.Declare an array  and take input from user to fill that array, take two integer input from the user, you have to find the indices of those numbers and then exchange those numbers.
//E.g- if 45 comes at index 3 and 67 comes at index 9. After exchange, index 3 should contain 67 and index 9 should contain 45. 
package Codes;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("Array Values: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Num1: ");
		int a = sc.nextInt();
		System.out.print("Num2: ");
		int b = sc.nextInt();

		int index_a = 0, index_b = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				index_a = i;
			}
			if (arr[i] == b) {
				index_b = i;
			}
		}
		int c = arr[index_a];
		arr[index_a] = arr[index_b];
		arr[index_b] = c;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "   ");
		}

	}
}
