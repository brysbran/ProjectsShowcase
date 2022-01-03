

public class Searches
{
    public void sequentialSearch(int[] arrayToSearch, int numberToFind)
    {
        for (int i = 0; i < arrayToSearch.length; i++)
        {
               if(arrayToSearch[i] == numberToFind)
               {
                   System.out.println("Found " + numberToFind + " at index " + i);
                   return;
               }
        }
        System.out.println("Did not find " + numberToFind);
    }


    public int binarySearch(int[] arrayToSort, int key)
    {
        int low = 0;
        int high = arrayToSort.length - 1;
        int middle = (low + high + 1)/2;
        int location = -1;

        do
        {
            if(key == arrayToSort[middle])
            {
                location = middle;
            }
            else if(key < arrayToSort[middle])
            {
                high = middle - 1;
            }
            else
            {
                low = middle + 1;
            }

            middle = (low + high + 1) / 2;

        }  while((low <= high) && (location == -1));
        
        return location;
    }

    public static String leftoverNum(int[] arrayNum, int low, int high)
    {
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < low; i++)
        {
            temp.append("     ");
        }

        for(int i = 0; i <= high; i++)
        {
            temp.append(arrayNum[i] + " ");
        }

        return String.format("%s%n", temp);
    }



}
