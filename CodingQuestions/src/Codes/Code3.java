package Codes;

public class Code3 {

	public static void main(String[] args) {

		System.out.println("@");

		for (int i = 5; i >= 1; i--) {
			System.out.print("@");
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println("@");

		}
		for (int j = 5; j > 0; j--) {
			System.out.print("@ ");
		}
		System.out.println();
		
		for(int a=1, b=10, c=11, d=20, e=21, f=30; a<=10; a++, b--,c++,d--,e++,f--) {
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " ");
		}

	}
	

}
