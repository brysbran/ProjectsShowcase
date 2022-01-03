// ---------------------------------------------------------------------------
// File name:Room
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Veronica Watson - watsonvs@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 11/16/2021
// ---------------------------------------------------------------------------

import java.util.ArrayList;


public class Room extends ItemFileReader
{
    //constants
    private final int MAX_HEIGHT = 5;
    private final int MAX_WIDTH = 5;
    private final int LEVELS = 3;

    //variables for the class
    private static ArrayList<Enemy> roomContentsEnemies;
    private static ArrayList<ItemObject> roomContentsItems;
    private static boolean[][][] roomLayout;
    private boolean detectItem, detectEnemy;
    private int info;
    private int spawnX, spawnY;

    //creates new arrays for items, enemies and the layout of the rooms
    public Room()
    {
        roomContentsItems = new ArrayList<>();
        roomContentsEnemies = new ArrayList<>();
        roomLayout = new boolean[MAX_HEIGHT][MAX_WIDTH][LEVELS];
    }


    //method that creates rooms and put specific enemies, and items, into the specific rooms
    public void createRooms(String path)
    {
        readfile(path);

        roomContentsItems = getItemList();
        //fill contents of the rooms

        //add enemies to the room
        roomContentsEnemies.add(new Enemy("Bert & Ernie"));
        roomContentsEnemies.add(new Enemy("Snuff"));
        roomContentsEnemies.add(new Enemy("Grover"));
        roomContentsEnemies.add(new Enemy("The Count"));
        roomContentsEnemies.add(new Enemy("Cookie Monster"));
        roomContentsEnemies.add(new Enemy("Elmo"));
        //roomContents.add(new Enemy("BIG BIRD"));

        //Creates the rooms and sets them to true so that we can later makes sure the room exists when you walk into it
        //level one
        roomLayout[0][0][0] = true;
        roomLayout[1][0][0] = true;
        roomLayout[2][0][0] = true;
        roomLayout[3][0][0] = true;
        roomLayout[4][0][0] = true;

        roomLayout[2][1][0] = true;

        roomLayout[1][2][0] = true;
        roomLayout[2][2][0] = true;

        roomLayout[0][3][0] = true;
        roomLayout[1][3][0] = true;
        roomLayout[2][3][0] = true;
        roomLayout[3][3][0] = true;

        roomLayout[2][4][0] = true;

        //level Two
        roomLayout[2][0][1] = true;
        roomLayout[3][0][1] = true;
        roomLayout[4][0][1] = true;

        roomLayout[0][1][1] = true;
        roomLayout[1][1][1] = true;
        roomLayout[2][1][1] = true;
        roomLayout[3][1][1] = true;

        roomLayout[1][2][1] = true;
        roomLayout[2][2][1] = true;
        roomLayout[3][2][1] = true;

        roomLayout[3][3][1] = true;
        roomLayout[4][3][1] = true;

        roomLayout[4][4][1] = true;

        //levelThree
        roomLayout[0][0][2] = true;
        roomLayout[1][0][2] = true;
        roomLayout[2][0][2] = true;
        roomLayout[3][0][2] = true;
        roomLayout[4][0][2] = true;

        roomLayout[4][1][2] = true;
        roomLayout[4][2][2] = true;

        roomLayout[1][2][2] = true;
        roomLayout[2][2][2] = true;
        roomLayout[3][2][2] = true;

        roomLayout[1][3][2] = true;
        roomLayout[2][3][2] = true;
        roomLayout[3][3][2] = true;

        roomLayout[1][4][2] = true;
        roomLayout[2][4][2] = true;

    }

    //handles exceptions to make sure youre in a room
    public boolean isRoom(int x, int y, int l)
    {
        try
        {
            return roomLayout[x][y][l];
        }
        catch (Exception e)
        {
            return false;
        }
    }


    //sets the start point of which room youre in at which level
    public void getNextLevelSpawn(int l)
    {
        if(l == 0) {spawnX = 2; spawnY = 0;}
        if(l == 1) {spawnX = 2; spawnY = 0;}
        if(l == 2) {spawnX = 4; spawnY = 0;}
    }

    //allows the player to potentially go back to the level before
    public void getBeforeLevelSpawn(int l)
    {
        if(l == 1)
        {
            spawnX = 2; spawnY = 0;
        }
        else if(l == 2)
        {
            spawnX = 2; spawnY = 0;
        }
    }


    public int getSpawnX()
    {
        return spawnX;
    }

    public int getSpawnY()
    {
        return spawnY;
    }


    //get the room which hold the exit from the level
    public boolean getExit(int x, int y, int l)
    {
        if(x == 2 && y == 4 && l == 0)
        {
            return true;
        }
        if(x == 4 && y == 4 && l == 1)
        {
            return true;
        }
        if(x == 3 && y == 4 && l == 2)
        {
            return true;
        }
        return false;
    }

    //checks to see whats in the room, and if there is an enemy or item or not
    public boolean detectRoomContent(int x, int y, int l) {

        detectItem = false;
        detectEnemy = false;

        //if it meets the requirements of having an enemy in the room, it will return that there is an enemy
        for(int i = 0; i < roomContentsEnemies.size(); i++) {

            if(roomContentsEnemies.get(i).getX() == x && roomContentsEnemies.get(i).getY() == y && roomContentsEnemies.get(i).getZ() == l) {
                info = i;
                detectEnemy = true;
                return true;
            }

        }
        //if it meets the requirements of having an item in the room, it will return that there is an item
        for(int i = 0; i < roomContentsItems.size(); i++) {

            if(roomContentsItems.get(i).getItemX() == x && roomContentsItems.get(i).getItemY() == y && roomContentsItems.get(i).getItemLevel() == l) {
                info = i;
                detectItem = true;
                return true;
            }
        }

        return false;
    }

    public Enemy getEnemyInforamtion() {
        return roomContentsEnemies.get(info);
    }

    public static ArrayList<Enemy> getRoomContentsEnemies() { return roomContentsEnemies; }

    public ItemObject getItemInformation() {
        return roomContentsItems.get(info);
    }

    public boolean isDetectEnemy() {
        return detectEnemy;
    }

    public boolean isDetectItem() {
        return detectItem;
    }

}