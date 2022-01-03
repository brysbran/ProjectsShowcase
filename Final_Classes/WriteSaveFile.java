// ---------------------------------------------------------------------------
// File name:Inventory
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Bryson Brandon - brandonbc@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 2 n
// ---------------------------------------------------------------------------

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;


public class WriteSaveFile
 {

    private String path;
    private Events events;

    //position on map
    //enemies killed
    //items they have

    //default constructor
    public WriteSaveFile(Events events)
    {
        this.events = events;
    }

    //actually writes the file
    public boolean writeSaveFile(String path)
    {
        this.path = path;
        String enemiesDead = "";
        String items = "";
        String itemEquipped;
        int locationX, locationY, locationZ;
        double playerHealth;

        playerHealth = events.getMainCharacter().getHealth(); //health
        itemEquipped = events.getInventory().getItemHeld();

        locationX = events.getMovement().getCurrentPlayerPositionX();
        locationY = events.getMovement().getCurrentPlayerPositionY();
        locationZ = events.getMovement().getCurrentPlayerPositionLevel();

        for(int i = 0; i < 6; i++) { //Enemies dead
            if(events.getRoom().getRoomContentsEnemies().get(i).isDead())
            {
                enemiesDead += events.getRoom().getRoomContentsEnemies().get(i).getName() + breaker();
            }
        }

        for(int i = 0; i < events.getInventory().getMyInventory().size(); i++) //items in inventory
        {
            items += events.getInventory().getMyItems(i) + breaker();

        }


        try
        {
        FileWriter writeSave = new FileWriter(new File(path));

        writeSave.write(String.valueOf(playerHealth));
        writeSave.write(enemiesDead);
        writeSave.write(items);
        writeSave.write(itemEquipped);
        writeSave.write(String.valueOf(locationX) + breaker() + String.valueOf(locationY) +breaker() + String.valueOf(locationZ));

        }
        catch(FileNotFoundException noFile)
        {
            System.out.println("File nor found");
            return false;
        }
        catch(IOException ioException)
        {
            System.out.println("Uh oh spaghettio! Your save corrupted.");
            return false;
        }

        return true;
    }


    public void createFile()
    { 
        try
        {
            File saveObj = new File("SaveFile.txt");
            if(saveObj.createNewFile())
            {
                System.out.println("New save made " + saveObj);
            }
            else{
                System.out.println("Save file already exists");
            }   
        }
        catch(IOException exception)
        {
            System.out.println("Uh oh spaghettio! Your save corrupted.");
        }

    }

    private String breaker()
    {
        return "|";
    }







    
}
