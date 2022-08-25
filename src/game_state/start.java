package game_state;

import games.Asylum.Rooms.FirstRoom;

import java.util.Scanner;

public class start {
    static Scanner scan = new Scanner(System.in);
    static FirstRoom firstRoom = new FirstRoom();
    public static void startScreen() {


        System.out.println("Welcome to the game!");
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!\nI hope you enjoy playing this game!");
        System.out.println("Current there is only one game which is Asylum");
        System.out.println("Please enter your game choice: ");
        String gameChoice = scan.nextLine();
        if(gameChoice.equalsIgnoreCase("asylum")) {
            System.out.println("You have chosen to play the Asylum game!");
            //Trigger Asylum game here
            firstRoom.startAsylumGame();
            firstRoom.AnnieRoom();
        }
        else {
            System.out.println("You have entered an invalid choice!");
        }


    }
}
