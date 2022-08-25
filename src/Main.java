import game_state.gameState;

import static game_state.start.startScreen;

public class Main {
    public static void main(String[] args) {

        startGame();
    }

    //Game starts here
    public static void startGame() {
        //Initialize game state
        gameState.setPlaying(true);
        System.out.println("Game starting...");

        //Start game
        startScreen();

    }
}