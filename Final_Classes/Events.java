// ---------------------------------------------------------------------------
// File name:Map
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Julian Hyder - hyderjc@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification:
// ---------------------------------------------------------------------------


public class Events extends Thread {
    
    //created file objects
    private Room room;
    private CharacterMovement movement;
    private MainCharacter mainCharacter;
    private Inventory inventory;
    private Narration narration = new Narration();
    private Combat combat;

    //file variables
    private final String path = "src/ItemList";
    private volatile boolean keeprunning;
    private String eventString = "";

    public Events() {

        //instantiate files
        room = new Room();
        inventory = new Inventory();
        mainCharacter = new MainCharacter("Oscar",5,10);
        movement = new CharacterMovement(room);
        combat = new Combat(room, mainCharacter, inventory);

        //create player spawn and create rooms for map
        movement.setCharacterPlace(2,0,0);
        room.createRooms(path);
        keeprunning = true;
    }


    /**
     * This method is a thread that will constantly check for events
     * I.E combat, items, exit, new spawn, and more 
     */
    public void run() {

        while(keeprunning) { 

            //CHECKS ROOMS FOR ENEMIES OR ITEMS
            if(room.detectRoomContent(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel())){
              
                //ENEMY DETECTED
                if(room.isDetectEnemy() && !room.getEnemyInforamtion().isDead()) {

                    eventString = narration.monsterFound()+" "+room.getEnemyInforamtion().getName();
                    combat.engageCombat();

                    while(keeprunning) {

                        if(room.getEnemyInforamtion().isDead()) {
                            //outOfBossRoom();
                            combat.setCombat(false);
                            playerHealthReset();
                            eventString = narration.enemyDead();
                            break;
                        }

                        if(!combat.isCombat() ) {
                            eventString = narration.playerFlee();
                            enemyHealthReset();
                            playerHealthReset();
                            outOfBossRoom();
                            break;
                        }

                        room.getEnemyInforamtion().setHealth(combat.getEnemyHealth());
                    }
                }

                //ITEM DECTECTED
                if(room.isDetectItem() && !inventory.getMyInventory().contains(room.getItemInformation())) {
                    inventory.add(room.getItemInformation());
                    eventString = narration.itemFound(room.getItemInformation().getName());
                }

                //try{ sleep(1500); } catch(Exception e) {continue;}
            }



            if(room.getExit(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel())){
                if(true) { //WILL NEED TO CHECK IF BOSSES ARE BEATEN
                    movement.nextLevel();
                    eventString = narration.gotoNextFloor();
                    room.getNextLevelSpawn(movement.getCurrentPlayerPositionLevel());
                    movement.setCharacterPlace(room.getSpawnX(), room.getSpawnY(), movement.getCurrentPlayerPositionLevel());
                }

                //try{ sleep(1500); } catch(Exception e) {continue;}
            }
        }    
    }

    private void outOfBossRoom() {
        if(room.isRoom(movement.getCurrentPlayerPositionX() + 1, movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel()))
            movement.setCharacterPlace(movement.getCurrentPlayerPositionX() + 1, movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel());
        else if(room.isRoom(movement.getCurrentPlayerPositionX() - 1, movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel()))
            movement.setCharacterPlace(movement.getCurrentPlayerPositionX() - 1, movement.getCurrentPlayerPositionY(), movement.getCurrentPlayerPositionLevel());
        else if (room.isRoom(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY() + 1, movement.getCurrentPlayerPositionLevel()))
            movement.setCharacterPlace(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY() + 1, movement.getCurrentPlayerPositionLevel());
        else if (room.isRoom(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY() - 1, movement.getCurrentPlayerPositionLevel()))
            movement.setCharacterPlace(movement.getCurrentPlayerPositionX(), movement.getCurrentPlayerPositionY() - 1, movement.getCurrentPlayerPositionLevel());
    }

    private void enemyHealthReset() {


    }

    
    private void playerHealthReset() {


    }


    public String map() {
        String s = "";

        for(int y = 5; y >= 0; y--) {
            for(int x = 0; x < 5 ; x++) {
                if(x == movement.getCurrentPlayerPositionX() && y == movement.getCurrentPlayerPositionY()){
                    s += "[*]";
                }
                else if(room.isRoom(x, y, movement.getCurrentPlayerPositionLevel())) {
                    s += "[ ]";
                }
                else {
                    s += "   ";
                }
            }
            s += "\n";
        }

        return s;
    }


    public void setEventString(String eventString) {
        this.eventString = eventString;
    }


    public String getEventString() {
        String s = eventString;
            
        if(!s.equals("")) 
        {
            s += "\n\n"; 
        }

        eventString = ""; 
        return s;
    }


    public void setClose() {
        combat.quit(); this.keeprunning = false;
    }

    public boolean isKeeprunning() {
        return keeprunning;
    }

    public Room getRoom() {
        return room;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public MainCharacter getMainCharacter() {
        return mainCharacter;
    }

    public CharacterMovement getMovement() {
        return movement;
    }

    public Combat getCombat() {
        return combat;
    }

}
