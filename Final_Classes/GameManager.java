// ---------------------------------------------------------------------------
// File name:GameManager
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: everyone
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 2 n
// ---------------------------------------------------------------------------


//version without GUI
// what is ran in driver, backbone of game
import java.util.Scanner;

public class GameManager {

    private Scanner kb;
    private GameSave gameSave;
    private Events event;
    private Inventory inventory;
    private CharacterMovement movement;
    private Combat combat;
    private Narration narative;
    private Stats stats;

    private String userInput;


    public GameManager(){
        kb = new Scanner(System.in);
        event = new Events();
        narative = new Narration();
        stats = new Stats(event);
        combat = event.getCombat();
        inventory = event.getInventory();
        movement = event.getMovement();
        gameSave = new GameSave(event);

        do{
        System.out.print("Do you have a saved game? If you do have a save and you \ntype (n) it will overwrite - y or n: ");
        userInput = kb.nextLine();
            
            if(userInput.trim().equals("y")) {
                if(gameSave.checkForSave(true)) {
                    gameSave.loadSave();
                }
            }
            else if(userInput.trim().equals("n")) {
                gameSave.checkForSave(false);
                tutorial();
                break; 
            }
            else System.out.println("command unrecognizable");

        } while(true);

        event.start();



        //main loop
        try {
            while(true){
                if(!combat.isCombat() && !inventory.isInInventory()) System.out.print(narative.displayGeneralGettingCommand());
                if(!combat.isCombat() && inventory.isInInventory()) System.out.print(narative.displayGettingInventoryInput());
                if(combat.isCombat() && !inventory.isInInventory()) System.out.print(narative.displayCombatGetterCommands());
                userInput = kb.nextLine();
    
                if(quitCommand(userInput)) break; // if the user inserts a quit command, the game loop ends
                if(!combat.isCombat() && !inventory.isInInventory())generalCommand(userInput);
                else if(!combat.isCombat() && inventory.isInInventory()) inventoryCommands(userInput);
                else if(combat.isCombat()) fightCommands(userInput);
                System.out.print(event.getEventString());
            }
        } catch (Exception e) {
            
        }
    }

    private void tutorial() {
        System.out.println(narative.tutorialSpeech());
    }


    // hold commands that quit (end without iterating through other commands)
    private boolean quitCommand(String userInput){
        switch(userInput.toUpperCase().trim()){
            case "QUIT", "Q", "END", "STOP", "PINEAPPLE":
                endEventThread();
                return true;
        }
        //so game does not end
        return false;
    }


    // hold inventory commands, etc.
    private void generalCommand(String userInput){
        switch(userInput.toUpperCase().trim()){
            case "HELP":
                System.out.println(narative.displayGeneralCommands());
                return;
            case "NORTH", "N", "UP", "U":
                if(movement.moveUP()) System.out.println(narative.moveNorth()); //says some narative
                else System.out.println(narative.blocked());
                return;
            case "SOUTH", "S", "DOWN", "D":
                if(movement.moveDown()) System.out.println(narative.moveSouth()); //says some narative
                else System.out.println(narative.blocked());
                return;
            case "EAST", "E", "RIGHT", "R":
                if(movement.moveRight()) System.out.println(narative.moveEast()); //says some narative
                else System.out.println(narative.blocked());
                return;
            case "WEST", "W", "LEFT", "L":
                if(movement.moveLeft()) System.out.println(narative.moveWest()); //says some narative
                else System.out.println(narative.blocked());
                return;

            
            case "Inventory", "I":
                inventory.openInventory();
                System.out.println(inventory.displayInventory());
                return;
            case "STATS", "`":
                stats.refreshStats();
                System.out.println(stats.output());
                return;
            case "MAP", "M":
                System.out.println(event.map());
                return;
            case "SAVE":
                gameSave.saveTheGame();
                return;

            case "": //this is just for formating it irritates JC if we dont have this
                return;
            default:
                System.out.println(narative.notACommand());
        }
    }


    private void fightCommands(String userInput) {
        switch(userInput.toUpperCase().trim()) {
            case "HELP":
                System.out.println(narative.displayCombatCommands());
                return;
            case "FLEE", "F", "RUN":
                    combat.flee();
                return;
            case "A","ATTACK":
                if(combat.attack()) System.out.println(narative.enemyHitYou());
                else System.out.println(narative.fightingWords());
                return;

            case "B","block","BLOCK","DEFEND","defend":
                combat.block();
                System.out.println(narative.blocked());
                return;

            case "": //this is just for formating it irritates JC if we dont have this
                return;
            default:
                System.out.println(narative.notACommand());
        }
    }

    private void inventoryCommands(String userInput) {
        switch(userInput.toUpperCase().trim()) {
            case "HELP":
                System.out.println(narative.displayInventoryCommands());
                return;
            case "LEAVE", "L":
                inventory.closeInventory();
                return;
            case "CURRENTITEM", "C":
                System.out.println(inventory.getItemHeld());
                return;
            case "": //this is just for formating it irritates JC if we dont have this
                return;
            default:
                if(!userInput.trim().matches("[a-zA-Z]+")) {
                    inventory.equipItem(userInput.trim());
                    System.out.println(narative.itemEquiped(inventory.getItemHeld()));
                }
        }

    }

    private void endEventThread() {
        try {
            event.setClose();
            event.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


