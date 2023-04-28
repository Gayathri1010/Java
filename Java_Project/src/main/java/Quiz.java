import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points =0;
		System.out.println("1.Which country held the 2016 Summer Olympics? ");
		System.out.println("\ta) China \n\tb) Ireland \n\tc) Brazil \n\td)Italy");
		String ans1 = sc.nextLine();
		System.out.println("2. Which planet is the hottest");
		System.out.println("\ta) Venus \n\tb) Saturn \n\tc) Mercury \n\td) Mars");
		String ans2 = sc.nextLine();
		System.out.println("3. What is the rarest blood type");
		System.out.println("\ta) O \n\tb) A \n\tc) B \n\td) AB-Negative");
		String ans3 = sc.nextLine();
		System.out.println("4. Which one of these characters is friend with Harry Potter?");
		System.out.println("\ta) Ron Weasley \n\tb) Hermione Granger \n\tc) Draco Malfoy");
		String ans4 = sc.nextLine();
		
		if(ans1.equalsIgnoreCase("c")) {
			points+=5;
		}
		if(ans2.equalsIgnoreCase("a")) {
			points+=5;
		}
		if(ans3.equalsIgnoreCase("d")) {
			points+=5;
		}
		if(ans4.equalsIgnoreCase("a") || ans4.equalsIgnoreCase("b")) {
			points+=5;
		}
		System.out.println("Your final score is: "+points);
		if(points>15) {
			System.out.println("Wow, you know your stuff");
		}
		if(points<15 && points>=5) {
			System.out.println("Not bad");
		}
		
		
	}
}
