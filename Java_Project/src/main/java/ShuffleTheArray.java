
public class ShuffleTheArray {
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
		int n=3;
		int c[] = arrayShuffle(arr,n);
		for(int i:c) {
			System.out.print(i+ " ");
		}
		
	}
	public static int[] arrayShuffle(int[] arr, int n) {
		int ans[] = new int[2*n];
		for(int i=0;i<n;i++) { //0
			ans[2*i] = arr[i]; //ans[0] = 2,
			ans[2*i+1]=arr[i+n]; //ans[1]= 0+3 arr[3] = 3
		}
		return ans;
		
	}
}
 //0 1