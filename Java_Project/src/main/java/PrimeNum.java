
public class PrimeNum {
	public static void main(String[] args) {
		int a = 2;
		int b = 10;
		boolean notAPrime;
		boolean isItPrime;
		//int count=0;
		for(int i=a; i<=b;i++) {
			if(IsPrime(i)) {
				System.out.println(i);
			}
				
			}
		}
	
		public static boolean IsPrime(int n) {
			if(n<=1) {
				return false;
			}
			for(int j=2; j<=Math.sqrt(n); j++) {
				if(n%j ==0) {
					return false;
				}
			}
			return true;
		}	
}