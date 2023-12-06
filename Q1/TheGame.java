package Q1;

import java.util.Scanner;

public class TheGame {
  
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		boolean playing=true;
		while (playing) {
			GameManager g = new GameManager();
			g.play();
			System.out.println("Would you like to play again [y]?");
			playing = (s.next().charAt(0) == 'y') ? true: false; 
		}
	}
}

