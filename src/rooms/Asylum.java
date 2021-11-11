package rooms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

import actions.ActionsForPlayer;

public class Asylum {
	
	static Timer time = new Timer();
	
	public static String user;
	
	ActionsForPlayer playerAct = new ActionsForPlayer();
	
	public void passages() {
		/*
		 * TODO: implement passages logic
		 * passages can include: doors, lockers, holes(such as in a wall), and vents/ducts
		 */	
		//implement a more descriptive way to describe data
		ArrayList <Integer> doors = new ArrayList<>();
		doors.add(1);
		doors.add(2);
		doors.add(3);
		doors.add(4);
		doors.add(5);
		doors.add(6);
		int staffLocker1 = 1;
		int staffLocker2 = 2;
		int staffLocker3 = 3;
		int janitorCloset = 4;
	}	

	public static void asylumGame() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("|*|*|*|*|*|*|*|*|*|*|*|");
		System.out.println("Welcome to the Asylum!");
		System.out.println("|*|*|*|*|*|*|*|*|*|*|*|");
		System.out.println();
		System.out.println("You have 6 minutes to complete this challenge.");
		System.out.println();
		System.out.println("Every room you enter will display a list of items of interest"
						 + "\nTo investigate items further simply type a '!' followed by the item name.\nSuch as: !toolbox"
						 + "\nOnce information is displayed, you can use this information to discover further clues!"
						 + "\nIf you get stuck, at any time you can type "
						 + "\n!return\n to return to the intial room. ONLY from this room are hints available, once in the room, simply type"
						 + "\n!hint\n");
		System.out.println("Please note that you can switch to another room before beginning this room."
						 + "\nHowever if you begin this room, you will not be able to switch");
		System.out.println("\nIf you'd like to switch, please type\n!switch");
		System.out.println("\nWhen you ready to begin, please type:\n!begin");
		System.out.println("\nPlease note that the timer will begin!");
		
		String input = scan.nextLine();
		if(input.equals("!begin")) {
			//Game logic
			System.out.println("Best of luck!!");
		}
		
		else if(input.equals("!switch")) {
			//switch rooms
			input = scan.nextLine();
			if(input.equals("!switch")) {
				//switch to another room
			}
		} 
		
		else {
			//incorrect input
			System.out.println("It appears your input is incorrect.\nPlease re-enter your input.");
		}
	}
}