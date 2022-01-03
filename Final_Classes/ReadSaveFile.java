// ---------------------------------------------------------------------------
// File name:Inventory
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Bryson Brandon - brandonbc@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 2 n
// ---------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadSaveFile 
{

    private Events events;
    private Inventory inventory;
    private CharacterMovement movement;
    private Room room;
    private ArrayList<String> saveInfo;

    //position on map
    //enemies killed
    //items they have

    public ReadSaveFile(Events event) {
        this.events = event;
    }


    //reads the save file
    public void readFile(String path)
    {
        String temp = "";
        int i = 0;
        String entry; //this is the separation in the save file between thing
        saveInfo = new ArrayList<>();


        try(BufferedReader myFileReader = new BufferedReader(new FileReader(path)))
        {
            i = lineCounter(path);

            for(int n = 0; n < i; n++){
                switch (n) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
            }


            while((entry = myFileReader.readLine()) != null)
            {
                //sets save info to game
                String[] playerInfo = entry.split("\\|");


                events.getMovement().setCharacterPlace(Integer.parseInt(playerInfo[0]), Integer.parseInt(playerInfo[1].trim()), Integer.parseInt(playerInfo[2]));
                events.getInventory().equipItem(playerInfo[3].trim());
            
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Save File Not Found!");
        } 
        
        catch(IOException ioException) 
        {
            System.out.println("Save reader report issues.");
        }

    }

    private int lineCounter(String path) throws IOException{
        int i = 0;
        Scanner scan  = new Scanner(new FileReader(path));
        while(scan.hasNextLine()) i++;
        return i;
    }

    public ArrayList<String> getSaveInfo()
    {
        return saveInfo;
    }








}
