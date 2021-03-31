package Quest;

import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> rooms;
    private Room currentRoom;

    public Quest() {
        rooms = new ArrayList<Room>();
        currentRoom = null;
    }

    public void addRoomToQuest(Room room) {
        this.rooms.add(room);
    }

    public void startQuest() {
        this.currentRoom = this.rooms.get(0);
    }

    public void removeRoomFromQuestAndAdvanceToNextRoom() {
        this.rooms.remove(0);
        this.currentRoom = this.rooms.get(0);
    }

    public void moveToNextRoom() {
        currentRoom =
    }
}
