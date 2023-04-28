import java.util.HashMap;
import java.util.Map.Entry;

public class Fibonacci {
	public static void main(String[] args) {
		int[] n = {2,5,6,9,14,17,19,24};
		int result = BinarySearch(n);
		System.out.println(result);
	}
	public static int BinarySearch(int[] n) {
		int start =0;
		int target =16;
		int arrSize = n.length;
		int end = arrSize-1;
		while(start<=end) {
			int mid = start + ((end-start)/2);
			if(target>n[mid]) {
				start = mid+1;
			}
			else if(target<n[mid]) {
				end = mid-1;
			}
			else if(target==n[mid]) {
				return n[mid];
			}
		}
		return -1;
	}
	
}
