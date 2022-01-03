//Joseph Brooks lays claim


public class CharacterMovement {
    
    private int currentPlayerPositionX, currentPlayerPositionY, currentPlayerPositionLevel;
    private Room room;

    public CharacterMovement(Room room) {
        this.room = room;
    }

    public void setCharacterPlace(int x, int y, int l) {
        currentPlayerPositionLevel = l;
        currentPlayerPositionX = x;
        currentPlayerPositionY = y;
    }

    public boolean moveUP() {
        if(room.isRoom(currentPlayerPositionX, currentPlayerPositionY + 1, currentPlayerPositionLevel)) {
            currentPlayerPositionY = currentPlayerPositionY + 1;
            return true;}
        return false;
    }

    public boolean moveDown() {
        if(room.isRoom(currentPlayerPositionX, currentPlayerPositionY - 1, currentPlayerPositionLevel)) {
            currentPlayerPositionY = currentPlayerPositionY -1;
            return true;}
        return false;
    }

    public boolean moveRight() {
        if(room.isRoom(currentPlayerPositionX + 1, currentPlayerPositionY, currentPlayerPositionLevel)) {
            currentPlayerPositionX = currentPlayerPositionX + 1;
            return true;}
        return false;
    }

    public boolean moveLeft() {
        if(room.isRoom(currentPlayerPositionX - 1, currentPlayerPositionY, currentPlayerPositionLevel)) {
            currentPlayerPositionX = currentPlayerPositionX - 1;
            return true;}
        return false;
    }

    public void nextLevel() {
        currentPlayerPositionLevel = currentPlayerPositionLevel +1;
    }

    public int getCurrentPlayerPositionLevel() {
        return currentPlayerPositionLevel;
    }

    public int getCurrentPlayerPositionX() {
        return currentPlayerPositionX;
    }

    public int getCurrentPlayerPositionY() {
        return currentPlayerPositionY;
    }



}
