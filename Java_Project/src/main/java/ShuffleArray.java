
public class ShuffleArray {
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n=3;
		int start1 =0;
		int start2 = n;
		int[] ans = new int[nums.length];
		for(int i = 0; i<nums.length;i++) {
			if(i%2==0) {
				ans[i] = nums[start1];
				start1++;
			}
			else{
				ans[i]=nums[start2];
				start2++;
			}
			
		}
		
		for(int i:ans) {
			System.out.println(i+ " ");
		}
	}
}


