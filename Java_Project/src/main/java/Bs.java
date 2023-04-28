
public class Bs {
	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target =14;
		int res = ceilingBin(arr,target);
		System.out.println(res);
	}
	public static int ceilingBin(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		while(start<=end) {
			int middle = start+((end-start)/2);
			if(target>arr[middle]) {
				start=middle+1;
			}
			else if(target<arr[middle]) {
				end=middle-1;
			}
			else if(target==middle) {
				return arr[middle];
			}
			
		}
		return -1;
	}
}
