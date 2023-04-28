
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		int result = binarySearch(arr,target);
		System.out.println(result);
	}
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0; //5
		int end = arr.length -1; //9
		
		while(start<=end) { //0,9 //5,9
			int middle = start + ((end-start) /2); //4 //6
			if(target>arr[middle]) { //false //true
				start = middle +1; // 
			}
			else if(target<arr[middle]) { //true
				end = middle-1; //5
			}
			else if(target == arr[middle]) {
				return middle;
			}
		}
		return arr[end];
	}
}
