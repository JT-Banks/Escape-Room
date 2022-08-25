package games.Asylum.Rooms;

import actions.PlayerActions;

import java.util.HashMap;
import java.util.Scanner;

import static game_state.gameState.time;

public class FirstRoom {

    public static boolean asylumGameState = false;
    PlayerActions actions = new PlayerActions();
    static Scanner scan = new Scanner(System.in);

    public boolean startAsylumGame() {
        System.out.println("Asylum game started!");
        return asylumGameState = true;
    }
        public void AnnieRoom() {
            System.out.println("\t\t|*|*|*|*|*|*|*|*|*|*|*|");
            System.out.println("\t\tWelcome to the Asylum!");
            System.out.println("\t\t|*|*|*|*|*|*|*|*|*|*|*|");
            System.out.println("You have 6 minutes to complete the challenge.\n");
            System.out.println("Instructions: You will be placed in a room, with various objects that can be inspected.\n\nYou will be able to inspect objects as much as you want, however"
                    + " keep in mind the time does continue to count down.\n");
            while (time > 0) {
                System.out.println("\n***Command Menu***\n");
                System.out.println("1. Inspect");
                System.out.println("2. Repeat Clue");
                System.out.println("3. Interact");
                System.out.println("4. Traverse **specify direction: left, right, forward, back**");
                System.out.println("5. Time left");
                int input = scan.nextInt();
                switch (input) {
                    case 1: {
                        firstLevelInspection();
                    }
                    case 2: {
                        repeatClue();
                    }
                    case 3: {
                        System.out.println("Please specify what you'd like to interact with");
                        String interaction = scan.nextLine();
                        actions.inspect(interaction);
                        System.out.println("You choose: " + interaction);
                        inspectDesk();
                    }
                    default: {
                        System.out.println("Invalid input");
                    }
                }
            }
        }

    private void repeatClue() {
        /* Must have some logic here, to repeat the clue.
         * If a clue is repeated to a player, that player will infer a time penalty.
         * The player will be given a clue, and the time will be reduced by a certain amount.
         * Initial approach is to pass a variable here, and then use that variable to determine the time penalty.
         * Also, take that variable to determine which clue to give the player.
         */
        System.out.println("You have chosen to repeat the clue");
        System.out.println("This will reduce the time by 10 seconds");
        time -= 10;
        System.out.println("You have " + time + " seconds left"); //Maybe convert time to more readable format?
        /* Call method here to choose the right clue for the progress the player is at.
         * For example, if the player is at the first room, the first clue will be given.
         * determineClueToGivePlayer();
         */
    }


    private void inspectDesk() {
        HashMap<String, String> topDesk = new HashMap<>();
        topDesk.put("note", "The note reads:\n\nDear Annie,\n\nI am writing to you to tell you that you are the best friend I have ever had.\n\nSincerely,\n\nScratcher");
        topDesk.put("pencil", "This pencil has seen many uses, it is barely 2 inches long, and dull");
        topDesk.put("mechanical pencil sharpener", "This mechanical pencil sharpener is used to sharpen pencils");
        topDesk.put("metallic fan", "This metallic fan makes an eerie whirling sound, as if it's struggling to work. You notice burn marks on the fan");


        System.out.println("You inspect the desk");
        System.out.println("Here is a description of what lies on top of the desk:\nA note, a pencil, a mechanical pencil sharpener, and a metallic fan");
        System.out.println("Would you like to inspect any items on top of the desk? y/n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")) {
            System.out.println("Please specify what you'd like to inspect");
            System.out.println("");
            String itemToInspect = scan.nextLine();
            switch(itemToInspect) {
                case "note": {
                    System.out.println(topDesk.get("note"));
                }
            }

        }
        else {
            System.out.println("You choose not to inspect anything");
        }
    }
    private static void firstLevelInspection() {
        System.out.println("Here is a list of items you can inspect:");
        System.out.println("a. A desk");
        System.out.println("b. A chair");
        System.out.println("c. A bed");
        System.out.println("d. A vent");
        System.out.println("e. A door");
        System.out.println("f. A wall");
        switch(scan.nextLine()) {
            case "a": {
                System.out.println("You have inspected the desk.");
                break;
            }
            case "b": {
                System.out.println("You have inspected the chair.");
                break;
            }
            case "c": {
                System.out.println("You have inspected the bed.");
                break;
            }
            case "d": {
                System.out.println("You have inspected the vent.");
                break;
            }
            case "e": {
                System.out.println("You have inspected the door.");
                break;
            }
            case "f": {
                System.out.println("You have inspected the wall.");
                break;
            }
            default: {
                System.out.println("Invalid input!");
                break;
            }
        }
    }
}
