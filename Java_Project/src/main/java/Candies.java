import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Candies {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int eC = 3;
		List<Boolean> result = new ArrayList<>();
		int max = Arrays.stream(candies).max().getAsInt();
		result = Arrays.stream(candies).mapToObj(c-> ( c + eC >= max)).collect(Collectors.toList());
		System.out.println(result);
	}
	public static Boolean[] candyCount(int[] candies, int eC) {
		int noOfCandies = candies.length;
		int result[] = new int[noOfCandies];
		Boolean ans[] = new Boolean[noOfCandies];
		for(int i=0;i<noOfCandies; i++) {
			candies[i] = candies[i] + eC;		
		}
		for(int i=0;i<noOfCandies; i++) {
			for(int j=0;j<result.length;j++) {
				if(result[j]>candies[i]) {
					ans[j] = true;
				}
				else {
					ans[j]=false;
				}
			}
		}
		
		return null;
	}
	
}
