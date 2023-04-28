import java.util.Arrays;
import java.util.Scanner;

import com.google.common.base.MoreObjects.ToStringHelper;

public class TicTacToe {
	public static char[][] board = {
			{'_','_','_'},
			{'_','_','_'},
			{'_','_','_'}
	};
	public static void main(String[] args) {
		System.out.println("Let's play Tic Tac Toe");
		
		
		getInput();
	}
	public static void printBoard() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length;j++) {
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void getInput() {
		printBoard();
		for(int i=0;i<9;i++) {
			if(i%2 == 0) {
				System.out.println("Turn X");
				int[] spot =askUser();
				if(spot[0]>3 || spot[1]>3) {
					System.out.println("Invalid");
					break;
				}
				board[spot[0]][spot[1]] = 'X';
			}
			else {
				System.out.println("Turn O");
				int[] spot =askUser();
				board[spot[0]][spot[1]] = 'O';
			}
			printBoard();
		}
		
		
		
	}
	public static void getResult() {
		for(int i=0;i<3;i++) {
			
		}
		
	}
	public static int[] askUser() {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		return new int[] {x1,x2};
	}
	
	
	
	
}
