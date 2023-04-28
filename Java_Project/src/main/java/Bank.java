import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		System.out.println("****ROYAL BANK OF JAVA****");
		System.out.println("Are you here to get a mortgage? (yes or no)");
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		if(input1.equalsIgnoreCase("yes")) {
			System.out.println("Great! In one line" + "\nHow much money do you have in your savings?"+
								"\nAnd,how much do you owe in credit card debt?");
			int input2 = sc.nextInt();
			int input3 = sc.nextInt();
			
			System.out.println("How many years have you worked for? ");
			int input4 = sc.nextInt();
			
			System.out.println("What is your name?");
			String input5 = sc.next();
			if(input2 >=10000 && input3<5000 && input4>2) {
				System.out.println("Congratulations "+input5+", you have been approved");
				
			}
			else {
				System.out.println("Sorry, you are not eligible for a mortgage");
			}
		}
	
	}
}
                                                               