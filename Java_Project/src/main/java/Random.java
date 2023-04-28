

public class Random {
	public static void main(String[] args) {
		//System.out.println("Random Number 1: " + ThreadLocalRandom.current().nextInt(10,100));
		int fact =1;
		int n=5;
		while(n!=0) {
			fact+=n*(n-1);
			n-=2;
		}
		System.out.println("Factorial is " +fact);
		
	}
}
