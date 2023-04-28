
public class ConcatTwo {
	public static void main(String[] args) {
		int[] nums = {1,2,1};
		int[] ans = new int[nums.length*2];
		int count=2;
		int k=0;
		while(count>0) {
			for(int i=0;i<nums.length;i++) {
				ans[k] = nums[i];
				k++;
			}
			count--;
		}
		for(int i:ans) {
			System.out.println(i+ " ");
		}
		
	}
}
 