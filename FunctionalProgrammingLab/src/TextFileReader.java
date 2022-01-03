import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReader
{
    public ArrayList<Driver> readFile(String path)
    {
        ArrayList<Driver> driverList = new ArrayList<>();
        String entry;
        //try with resource must implement AutoCloseable interface
        try(BufferedReader myFileReader = new BufferedReader(new FileReader(path)))
        {
            //combine assignment to entry with null detection
            while((entry = myFileReader.readLine()) != null)
            {
                //next few lines are the same as the previous text reader
                String[] driverInfo = entry.split(",");
                Driver driver = new Driver();
                driver.setID(driverInfo[0]);
                driver.setFirstName(driverInfo[1]);
                driver.setLastName(driverInfo[2]);
                driver.setCarYear(Integer.parseInt(driverInfo[3]));
                driver.setCarMake(driverInfo[4]);
                driver.setCarModel(driverInfo[5]);
                driverList.add(driver);
                //no need to close the file because of try-with-resource
            }
        }
        //IOException is more general than FileNotFoundException, so this catches both
        catch(IOException ex)
        {
            System.out.println("File not found!");
        }

        return driverList;
    }
}
