package State;

import java.util.HashMap;

public class PickClue {
    private static final HashMap<Integer, String> firstRoomClueMap = new HashMap<>();

    public String firstRoomClues(String clue) {

        return clue;
    }

    private HashMap populateFirstRoomClueMap() {
        //First room will have a total of 8 clues, 2 of which are used to solve the room
        //indicated by the boolean value "bingoClue"
        //Data objects loaded and retrieved from a database, structure in GameStructure.json
        firstRoomClueMap.put(1, "burn marks");
        return firstRoomClueMap;
    }

}
