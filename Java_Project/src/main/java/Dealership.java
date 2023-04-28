import java.util.Scanner;

public class Dealership {
	public static void main(String[] args) {
		System.out.println("Welcome to the Java Dealershop.");
		System.out.println("  * Select option 'a' to buy a car");
		System.out.println("  * Select option 'b' to sell a car");
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		switch(input1){
			case "a":
				System.out.println("What is your budget? ");
				int budget = sc.nextInt();
				if(budget>=10000) {
					System.out.println("Great! A Nissan Tima is available");
					System.out.println("Do you have insurance");
					String input = sc.next();
					System.out.println("Do you have a Driver's license?");
					String input2 = sc.next();
				}
				else {
					System.out.println("Sorry! We dont sell cars under 10000 dollars");
				}
				break;
			case "b": 
				System.out.println("Sell");
				break;
			default: 
				System.out.println("Invalid");
				break;
		}
		
	sc.close();
	}
}
