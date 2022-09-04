package games.Asylum.Rooms;

import Actions.PlayerActions;
import State.Transitions;

import java.util.HashMap;
import java.util.Scanner;

import static State.GameState.startTime;
import static State.GameState.time;

public class FirstRoom {
    public static boolean firstRoomSolved = false;

    public static boolean asylumGameState = true;
    PlayerActions actions = new PlayerActions();
    private static final Scanner scan = new Scanner(System.in);

    public static HashMap<String, Boolean> roomFlags = new HashMap<>();

        public boolean AnnieRoom(boolean roomSolved) {
            System.out.println("""
                           _
                         _|=|__________
                        /              \\
                       /                \\
                      /__________________\\
                       ||  || /--\\ ||  ||
                       ||[]|| | .| ||[]||
                     ()||__||_|__|_||__||()
                    ( )|-|-|-|====|-|-|-|( )\s
                    ^^^^^^^^^^====^^^^^^^^^^^""");
            //Need to implement clear console method
            Transitions.ClearConsole();
            System.out.println("\nYou have 6 minutes to complete the challenge.\n");
            System.out.println("""
                    Instructions: You will be placed in a room, with various objects that can be inspected.
                    You will be able to inspect objects as much as you want, however keep in mind the time does continue to count down.
                    """);
            while (time > 0) {
                System.out.println("\n***Command Menu***");
                System.out.println("\t1. Inspect");
                System.out.println("\t2. Repeat Clue");
                System.out.println("\t3. Interact");
                System.out.println("\t4. Time left");
                int input = scan.nextInt();
                switch (input) {
                    case 1: {
                        firstLevelInspection();
                    }
                    case 2: {
                        System.out.println("Which clue would you like to repeat?");
                        String repeatClue = scan.nextLine();
                        repeatClue(repeatClue);
                    }
                    case 3: {
                        System.out.println("Please specify what you'd like to interact with");
                        String interaction = scan.nextLine();
                        actions.inspect(interaction);
                        System.out.println("You choose: " + interaction);
                        inspectDesk();
                    }
                    case 4: {
                        System.out.println("You have " + time + " minutes left");
                    }
                    default: {
                        System.out.println("Invalid input");
                    }
                }
            }
            if(playerSolved()) {
                System.out.println("You have solved the challenge!");
            }
            else {
                System.out.println("You have failed the challenge!");
            }
            return firstRoomSolved = false;
        }

    private boolean playerSolved() {
        return true;
    }

    private void repeatClue(String clue) {
        /* Must have some logic here, to repeat the clue.
         * If a clue is repeated to a player, that player will infer a time penalty.
         * The player will be given a clue, and the time will be reduced by a certain amount.
         * Initial approach is to pass a variable here, and then use that variable to determine the time penalty.
         * Also, take that variable to determine which clue to give the player.
         */
        System.out.println("You have chosen to repeat the clue");
        System.out.println("This will reduce the time by 4 minutes");
        time -= 4;
        long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedTimeInSeconds = elapsedTime / 1000;
        long elapsedTimeInMinutes = elapsedTimeInSeconds / 60;
        int timeLeft = (int) (time - elapsedTimeInMinutes);
        System.out.println("Time left: " + timeLeft + " minutes");
        //pickClue();
        /* Call method here to choose the right clue for the progress the player is at.
         * For example, if the player is at the first room, the first clue will be given.
         * determineClueToGivePlayer(Rooms room);
         */
    }
    //Need to return something to determine the clue to give the player.
    private void inspectDesk() {

        HashMap<String, String> topDesk = new HashMap<>();

        topDesk.put("note", "The note reads:\n\nDear Annie,\n\nI am writing to you to tell you that you are the best friend I have ever had.\n\nSincerely,\n\nScratcher");
        topDesk.put("pencil", "This pencil has seen many uses, and it contains black smudges...");
        topDesk.put("mechanical pencil sharpener", "This mechanical pencil sharpener is used to sharpen pencils");
        topDesk.put("metallic fan", "This metallic fan makes an eerie whirling sound, as if it's struggling to work. You notice burn marks on the fan...");

        System.out.println("You inspect the desk");
        System.out.println("Here is a description of what lies on top of the desk:\n\t**A note, \n\t**a pencil, \n\t**a mechanical pencil sharpener, \n\tand **a metallic fan");
        System.out.println("Would you like to inspect any items on top of the desk? y/n");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")) {
            System.out.println("Please specify what you'd like to inspect");
            System.out.println("Here is a list of items on top of the desk:\n\tNote, \n\tPencil, \n\tMechanical Pencil Sharpener, \n\tMetallic Fan");
            scan.reset();
            String itemToInspect = scan.nextLine();
            switch(itemToInspect.toLowerCase()) {
                case "note": {
                    System.out.println(topDesk.get("note"));
                }
                case "pencil": {
                    System.out.println(topDesk.get("pencil"));
                }
                case "mechanical pencil sharpener": {
                    System.out.println(topDesk.get("mechanical pencil sharpener"));
                }
                case "metallic fan": {
                    System.out.println(topDesk.get("metallic fan"));
                }
                default: {
                    System.out.println("Invalid input, please try again");
                }
            }

        }
        else {
            System.out.println("You choose not to inspect anything");
        }
    }
    private static void firstLevelInspection() {
        Scanner in = new Scanner(System.in);
        System.out.println("Here is a list of items you can inspect:");
        System.out.println("a. A desk");
        System.out.println("b. A chair");
        System.out.println("c. A bed");
        System.out.println("d. A vent");
        System.out.println("e. A door");
        System.out.println("f. A wall");
         switch (in.nextLine()) {
            case "a" -> {
                System.out.println("You have inspected the desk.");
            }
            case "b" -> {
                System.out.println("You have inspected the chair.");
            }
            case "c" -> {
                System.out.println("You have inspected the bed.");
            }
            case "d" -> {
                System.out.println("You have inspected the vent.");
            }
            case "e" -> {
                System.out.println("You have inspected the door.");
            }
            case "f" -> {
                System.out.println("You have inspected the wall.");
            }
            default -> {
                System.out.println("Invalid input!");
            }
        }
    }
}
