import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. What is your name? ");
		String name = sc.nextLine();
		System.out.println("Hi "+name+"! I'm Javabot. Where are you from?");
		String location =sc.nextLine();
		System.out.println("I hear its beautiful at "+location+"! I'm from place called Oracle");
		System.out.println("How old are you?");
		int age = sc.nextInt();
		System.out.println("So you're "+age+" cool!");
	}
}
