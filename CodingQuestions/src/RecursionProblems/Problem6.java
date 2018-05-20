//Q.We have mobile phones numbered 1,2,3....Even number of mobiles have 2 speakers and odd number of mobiles have 1 speaker.
//Send the number of mobile to a function and return the total  number of speakers all mobile phones have. 
package RecursionProblems;

public class Problem6 {

	public static void main(String[] args) {
		
		System.out.println("Mobile Speakers: " + mobileSpeakers(6));

	}
	public static int mobileSpeakers(int mobiles) {
		if(mobiles == 0) {
			return 0;
		}else {
			if(mobiles % 2 == 0) {
				return 2 + mobileSpeakers(mobiles - 1);
			}else {
				return 1 + mobileSpeakers(mobiles - 1);
			}
		}
	}

}
