
public class Fib {
	public static int n = 10;  //a=1; b=1; c= a+b; a=b; b=c;
	public static int b = 1;
	public static int a =0;
	public static int result =0;
	public static void main(String[] args) {
		//11235813
		Fib f = new Fib();
		f.fibo(n);
		
	}
	//using recurssion
	public void fibo(int n) {
		//n=10
		if(n>0) {
			result = a+b;
			a=b;
			b=result;
			System.out.println(" "+result);
			fibo(n-1);
		}
		
	}
}
