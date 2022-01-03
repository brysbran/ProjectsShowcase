import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReader
{
    public int[] readFile(String path)
    {
        int[] numbers;
        String entry;
        ArrayList<Integer> tempList = new ArrayList<>();
        //try with resource must implement AutoCloseable interface
        try(BufferedReader myFileReader = new BufferedReader(new FileReader(path)))
        {
            //combine assignment to entry with null detection
            while((entry = myFileReader.readLine()) != null)
            {
                tempList.add(Integer.parseInt(entry));
            }
        }
        //IOException is more general than FileNotFoundException, so this catches both
        catch(IOException ex)
        {
            System.out.println("File not found!");
        }

        numbers = new int[tempList.size()];
        int i = 0;
        for(Integer j:tempList)
        {
            numbers[i] = j;
            i++;
        }
        return numbers;
    }
}