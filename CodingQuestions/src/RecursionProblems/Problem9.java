//Q.Binary Search
package RecursionProblems;

public class Problem9 {

	public static void main(String[] args) {
		
		int array[] = {11,34,56,548,21,258,86,7,965,7598};
		System.out.println("BinarySearch: " + binarySearch(array, 21, 0, array.length - 1));

	}
	public static int binarySearch(int array[], int key, int start, int end) {
		if(start <= end) {
			int middle = (start+end)/2;
			if(array[middle] > key) {
				return binarySearch(array, key, start, middle - 1);
			}else if(array[middle] < key) {
				return binarySearch(array, key, middle + 1, end);
			}else {
				return middle;
			}
		}else {
			return -1;
		}
	}

}
