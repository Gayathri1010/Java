
public class Dice {
	public static void main(String[] args) {
		int roll1 = rollingDice();
		int roll2 = rollingDice();
		int roll3 = rollingDice();
		System.out.println(roll1);
		System.out.println(roll2);
		System.out.println(roll3);
	}
	public static int rollingDice() {
		double randomNum = Math.random()*6;  //Math.random - 0-0.9999
		randomNum+=1;
		return (int)randomNum;
	}
}
