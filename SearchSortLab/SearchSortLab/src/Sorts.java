import javax.lang.model.util.ElementScanner6;




public class Sorts
{
    public int[] bubbleSort(int[] arrayToSort)
    {
        boolean done = false;
        int iterations = 0;
        while(!done)
        {
            done = true;
            iterations++;
            for (int i = 0; i < arrayToSort.length - 1; i++)
            {
                if(arrayToSort[i] > arrayToSort[i + 1])
                {
                    swap(arrayToSort, i, i + 1);
                    done = false;
                }
            }
        }
        System.out.println("It took " + iterations + " iterations to sort this array");
        return arrayToSort;
    }

    public void selectionSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            int smallestNum = i;
            for(int indx = i + 1; indx < array.length; indx ++)
        {
            if(array[indx] < array[smallestNum]) 
            {
                smallestNum = indx;
            }
        }
        
        swap(array, i, smallestNum);
        }
    }


    public int binarySorts(int[] arrayToSort, int pass)
    {
        int min = 0;
        int max = arrayToSort.length - 1;
        int middle = (min + max + 1) / 2;
        int location = 0;

        do
        {
            if(arrayToSort[middle] == pass) location = middle;
            else if(pass < arrayToSort[middle]) max = middle - 1;
            else min = middle + 1;

            middle = (min + max + 1) / 2;

        }while(min <= max);
        return location;
    }



    public void swap(int[] arrayToSwap, int indexOne, int indexTwo)
    {
        int temp = arrayToSwap[indexOne];
        arrayToSwap[indexOne] = arrayToSwap[indexTwo];
        arrayToSwap[indexTwo] = temp;
    }

    private void printPass(int[] array, int pass, int indx)
    {
        for(int i = 0; i < indx; i++)
        {
            System.out.printf("%d   ", array[i]);
        }
        System.out.printf("%d  ", array[indx]);

        for(int i = indx + 1; i < array.length; i++)
        {
            System.out.printf("%d    ", array[i]);
        }
        System.out.printf("%n                      ");

        for(int b = 0; b < pass; b++)
        {
            System.out.print("--  ");
        }
        System.out.println();
    }
}
