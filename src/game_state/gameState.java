package game_state;

public class gameState {
    public static boolean PLAYING = true;
    public final static String PAUSED = "Game paused";
    public final static String GAME_OVER = "Game Over";
    public final static String GAME_WON = "Game Won";

    public static int time;

    //Getters
    public static boolean getPlaying() {
        return PLAYING;
    }
    public static boolean setPlaying(boolean state) {
        time = 60;
        return PLAYING;
    }
    public static String getPaused() {
        PLAYING = false;
          return PAUSED;
    }
    public static String getGameOver() {
        PLAYING = false;
        return GAME_OVER;
    }
    public static String getGameWon() {
        PLAYING = false;
        return GAME_WON;
    }
}
