import java.util.Scanner;

public class Game {
	public static String compChoice;
	public static String choice;
	public static String res;
	public static void main(String[] args) {
		gameReady();
		
		
	}
	public static void gameReady() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let's play Rock, Paper, Scissors. ");
		System.out.println("When I say 'shoot', Choose: rock, paper, or scissors");
		System.out.println("Are you ready? Write 'yes' if you are");
		
		String ready = scan.nextLine();
		gameSetup(ready);
		
	}
	public static void gameSetup(String ready) {
		Scanner scan = new Scanner(System.in);
		if(ready.equalsIgnoreCase("yes")) {
			System.out.println("Great! ");
			System.out.println("rock - paper - scissors, shoot!");
			String choice1 = scan.nextLine();
			String compChoice = randomNum();
			
			
			System.out.println("Computer Choice: "+ compChoice);
			String output = result(choice1,compChoice);
			System.out.println("The winner is: "+output);
		}
		
	}
	public static String randomNum() {
		
		int number = (int) (Math.random()*3);
		switch(number) {
		case 0: 
			choice = "rock";
			break;
		case 1:
			choice ="paper";
			break;
		case 2: 
			choice="scissors";
			break;
		default: choice = "Invalid";
		}
		return choice;
		
	}
	public static String result(String userC, String compC) {
		
		if(userC.equals(compC)) {
			res = "Same! Try another game";
		}
		else if(userC.equals("rock") && compC.equals("paper")) {
			res =  "Computer wins";
		}
		else if(userC.equals("paper") && compC.equals("scissors")) {
			res =  "Computer wins";
		}
		else if(userC.equals("scissors") && compC.equals("rock")) {
			res =  "Computer wins";
		}
		else if(compC.equals("rock") && userC.equals("paper")) {
			res =  "User wins";
		}
		else if(compC.equals("paper") && userC.equals("scissors")) {
			res =  "User wins";
		}
		else if(compC.equals("scissors") && userC.equals("rock")) {
			res = "User wins";
		}
		return res;
		
		
	}
}
