// ---------------------------------------------------------------------------
// File name:Inventory
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Bryson Brandon - brandonbc@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 2 n
// ---------------------------------------------------------------------------

import java.util.ArrayList;


public class Inventory {

    private ArrayList<ItemObject> myInventory; //inventory contents
    private boolean inInventory, itemFound;
    private ItemObject currentItemHeld;
    private String items;
    
    //Item attributes
    
    
    //creates the inventory
    public Inventory()
    {
        myInventory = new ArrayList<>();
        items = "Items in Inventory: \n";
        inInventory = false;
    }



    //opens the inventory
    public void openInventory()
    {
        inInventory = true;
    }

    //closes the inventory
    public void closeInventory() {
        inInventory = false;
    }

    //displays all items
    public String displayInventory()
    {
        for(int i = 0; i < myInventory.size(); i++)
        {
            items += "["+i+"]" + myInventory.get(i).getName() + "\n"; //displays the items and the items index inside brackets.
        }
        return items;
    }

    
    //adds items to inventory if there is space
    public void add(ItemObject item)
    {
        myInventory.add(item);
    }

    //equips an item that is in the inventory
    public boolean equipItem(String itemChosen)
    {
        try
         {
             //parses the item string to an integer for the arraylist
            currentItemHeld = myInventory.get(Integer.parseInt(itemChosen));
            itemFound = true; return true;   
        } 
        catch (Exception e) 
        {
            itemFound = false; 
            return false;
        }
    }

    //the ArrayList for inventory itself
    public ArrayList<ItemObject> getMyInventory() 
    {
        return myInventory;
    }

    public ItemObject getMyItems(int i) { return myInventory.get(i); }

    //checks if the player is in the inventory
    //very important for game manager to display correct commands
    public boolean isInInventory()
     {
        return inInventory;
    }

    //returns the item currently equiped, if no item is found return "no item"
    public String getItemHeld() 
    {
        if(currentItemHeld != null && itemFound) 
        {
        return currentItemHeld.getName();
        }
        
        return "no item";
    }

    // refers to current inventory object to get currentItem being equipped
    public ItemObject getCurrentItemHeld()
    {
        return currentItemHeld;
    }



}

