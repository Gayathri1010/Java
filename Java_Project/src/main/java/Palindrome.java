
public class Palindrome {
	public static void main(String[] args) {
		int n =454;
		int a;
		int sum =0;
		while(n>0) {
			a=n%10;
			sum = (sum*10)+a; 
			n=n/10;
		}
	}	
	}
