//Import Statements
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Main class file
public class ItemFileReader
{
    private ArrayList<ItemObject> itemList;
    private ItemObject itemObject;

    public void readfile(String path)
    {
        itemList = new ArrayList<>();
        String entry;

        try(BufferedReader myFileReader = new BufferedReader(new FileReader(path)))
        {
            //reading The level and Item location to collect data values(damage,descritption,and damage from the text file)
            while((entry = myFileReader.readLine()) != null)
            {
                //sets info of items from files
                String[] itemInfo = entry.split("\\|");
                itemObject = new ItemObject();
                itemObject.setItemLevel(Integer.parseInt(itemInfo[0].trim()));
                itemObject.setItemX(Integer.parseInt(itemInfo[1].trim()));
                itemObject.setItemY(Integer.parseInt(itemInfo[2].trim()));
                itemObject.setName(itemInfo[3].trim());
                itemObject.setDmg(Integer.parseInt(itemInfo[4].trim()));
                itemObject.setStatusEffect(DamageType.valueOf(itemInfo[5].trim()));
                itemObject.setDescription(itemInfo[6].trim());
                itemList.add(itemObject);
            }

        }
        catch(FileNotFoundException ex)
        {
            //In case item doesn't exist
            System.out.println("Item File Not Found!");
        }
        catch(ArrayIndexOutOfBoundsException A)
        {
            //In case item can't compile from text file
            System.out.println("ItemList Problems setting values into the arrayList");
        }
        catch(IOException I)
        {
            //In case unknown error occurs
            System.out.println("Item reader report issues");
        }


    }
    //Builds an array to hold the items for the inventory after they are collected
    public ArrayList<ItemObject> getItemList() {
        return itemList;
    }

    public ItemObject getItemObject() {
        return itemObject;
    }
}
