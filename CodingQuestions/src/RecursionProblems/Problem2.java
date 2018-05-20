//Q.we have cats and each cats have two eyes. send the number of cats to a function and return the total number of eyes all cats have.
package RecursionProblems;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("cats Eyes: " + catEyes(5));

	}
	
	public static int catEyes(int cats) {
		if(cats == 0) {
			return 0;
		}else {
			return 2 + catEyes(cats - 1);
		}
	}

}
