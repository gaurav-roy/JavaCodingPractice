//Q.Initialize integer array with 10 random values. Then print the second smallest as well as second largest element from that array.(E.g.- 23 7 2 56 3 8 9 here the second largest is 23 and second smallest is 3). 
package Codes;

public class Code15 {

	public static void main(String[] args) {
		
		int arr[] = {5,50,34,1,6,56,82,43,101};
		int small = arr[0], large = arr[0];
		int s_small = -1, s_large = -1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < small) {
				s_small = small;
				small = arr[i];
			}
			if(arr[i] > large) {
				s_large = large;
				large = arr[i];
			}
		}
		System.out.println(s_small + "     " + s_large);

	}

}
