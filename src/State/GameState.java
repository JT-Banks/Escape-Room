package State;

public class GameState {
    public static boolean PLAYING = true;
    public final static String PAUSED = "Game paused";
    public final static String GAME_OVER = "Game Over";
    public final static String GAME_WON = "Game Won";

    public static boolean roomSolved = false;

    public static boolean gameSolved = false;

    public static long time;

    public static long startTime;

    //Getters
    public static boolean getPlaying() {
        return PLAYING;
    }
    public static boolean setPlaying(boolean state) {
        time = 60; //minutes
        startTime = System.currentTimeMillis();
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
