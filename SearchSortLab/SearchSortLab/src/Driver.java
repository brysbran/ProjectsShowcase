public class Driver
{

    public static void main(String[] args)
    {
        TextFileReader reader = new TextFileReader();
        int[] numberArray = reader.readFile("E:/ETSU 21-22/CSCI-1260-001/LABS/SearchSortLab/SearchSortLab/src/numbers.csv");
        //printArray(numberArray);
        Sorts sorts = new Sorts();
        //System.out.println(sorts.binarySorts(numberArray, 9992));
        sorts.selectionSort(numberArray);
        printArray(numberArray);

        sorts.bubbleSort(numberArray);
        printArray(numberArray);
        Searches searches = new Searches();
        
        System.out.println(searches.binarySearch(numberArray, 4253));
    

        searches.sequentialSearch(numberArray, 8427);

        
    }

    public static void printArray(int[] numberArray)
    {
        for(int i:numberArray)
        {
            System.out.println(i);
        }
    }
}
