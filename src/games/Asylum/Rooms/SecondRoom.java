package games.Asylum.Rooms;

public class SecondRoom {
    FirstRoom firstRoom = new FirstRoom();
    public boolean secondRoomSolved = false;
    
    public boolean hallwayRoom(boolean secondRoomSolved) {
        
        if(firstRoom.AnnieRoom()) {
            secondRoom();
        }
        else {
            System.out.println("You have not solved the first room yet!");
        }
        
        return secondRoomSolved = true;
    }

    private void secondRoom() {
    }
}
