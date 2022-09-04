package State;

import games.Asylum.Rooms.FirstRoom;

import java.io.IOException;
import java.util.Scanner;

public class Start {
    private static final Scanner scan = new Scanner(System.in);
    static FirstRoom firstRoom = new FirstRoom();
    public static void startScreen(boolean running) {
        System.out.println("""
                ░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗
                ░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝
                ░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░
                ░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░
                ░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗
                ░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝
                \nPlease enter your name:\s""");
        String name = scan.nextLine();
        System.out.println("Please choose from the list of available escape rooms.\n֎ Asylum\n֎ Prison\n֎ FireStation");
        System.out.println("Please enter your game choice: ");
        String gameChoice = scan.nextLine();
        if(gameChoice.equalsIgnoreCase("asylum")) {
            System.out.println("\nYou have chosen to play the Asylum game!\n");
            //Trigger Asylum game here
            firstRoom.startAsylumGame(running);
            //placeholder for now, need to implement flags for rooms to determine if the player can move to the next room
            firstRoom.AnnieRoom(false);
        } else {
            System.out.println("You have entered an invalid choice!");
        }
    }
}
