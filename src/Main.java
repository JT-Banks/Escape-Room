import game_state.GameState;

import static game_state.Start.startScreen;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        startGame();
    }

    //Game starts here
    public static void startGame() throws InterruptedException {
        //Initialize game state
        GameState.setPlaying(true);
        System.out.println("Game starting...");
        //sleep for 2 seconds
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("...");
        //TimeUnit.SECONDS.sleep(2);
        System.out.println("...Game started!");
        //Start game
        startScreen();

    }
}