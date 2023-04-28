
public class BuildArray {
	public static void main(String[] args) {
		int[] nums = {5,0,1,2,3,4};
		int arrSize = nums.length;
		int[] ans= new int[arrSize];
		
		for(int i=0;i<arrSize;i++) {
			ans[i]=nums[nums[i]];
		}
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
}
