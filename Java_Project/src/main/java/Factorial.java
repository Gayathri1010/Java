
public class Factorial {
	public static void main(String[] args) {
		//System.out.println("Random Number 1: " + ThreadLocalRandom.current().nextInt(10,100));
		
		System.out.println("Hello");
		int fact =1;
		int n=5;
		for(int i =1; i<=n;i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial is " +fact);
		
	}
}
