import State.GameState;
import State.Transitions;

import java.util.concurrent.TimeUnit;

import static State.Start.startScreen;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        startGame(GameState.getPlaying());
    }
    //Game starts here
    public static void startGame(boolean gameState) throws InterruptedException {
        //Initialize game state
        GameState.setPlaying(true);
        System.out.println("Game starting.......");
        //sleep for 2 seconds
        Transitions.getSleep(3);
        System.out.println("....................");
        Transitions.getSleep(3);
        System.out.println(".......Game started!");
        //Start game pass in game state here
        startScreen(GameState.getPlaying());
    }
}