
public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = {{1,2,12},{3,4,6}};
		int richest =0;
		
		
		 for(int[] i :accounts){
			 int wealth =0;
			 for(int j:i) {
				 wealth+=j;
				}
			
			 if(richest < wealth) {
				 richest = wealth;
			 }
	        }
		 System.out.println(richest);
		 }
		
	}
