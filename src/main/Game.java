package main;

import java.util.Scanner;

import rooms.Asylum;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please state your name");
		String user = scan.nextLine();
		System.out.println("Welcome " +user+ "! \nPlease select an escape room.");
		System.out.println("Available options are: Asylum (more to come later)");
		String choiceRoom = scan.nextLine();
		
		if(choiceRoom.equalsIgnoreCase("asylum")) {
			//logic from asylum room here
			Asylum asylumGame = new Asylum();
			asylumGame.asylumGame();
		}
	}
}
