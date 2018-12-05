public class SortRunner
{

    //Challenge 1. Remove comment syntax above and below to test script.
    //---
    public static void main(String[] args)
    {
        Methods exerciseOne = new Methods();

        int[] array = {1,2,6,6,4,7,5,3,6,5,7,8,4,5,3,6};
        for (int j = 0; j < array.length; j++)
        {
            array[j] = (int)(Math.random()*10000);
        }

        System.out.println("Sorting...");
        Methods.intSort(array);
        System.out.println("Sorted.");

        int median = array.length/2;

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("The median of this array is " + array[median]);
    }



    /*
    //Challenge 2. Remove comment syntax above and below to test script.
    //---
    public static void main(String[] args)
    {
        int randomNum = (int)(Math.random()*10000);
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "j", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",};

        Methods exerciseTwo = new Methods();

        String[] arrayTwo = new String[10000];
        for (int j = 0; j < arrayTwo.length; j++)
        {
            String iString = "";
            for (int i = 0; i < 5; i++)
            {
                iString += alphabet[(int)(Math.random()*26)];
            }

            array[j] = iString;
        }
        String apple = "grape";
        array[randomNum] = apple;

        System.out.println("Sorting...");
        Methods.stringSort(arrayTwo);
        System.out.println("Sorted.");

        System.out.println("The index of your special string, " + apple + ", is " + randomNum);
    }
    //---
    */

    /*
    //Challenge 3. Remove the comment syntax above and below to test the script.
    //---
    public static void main(String[] args)
    {
        Methods exerciseThree = new Methods();

        int[] arrayThree = new int[100000];
        int randomPercentage = (int)(Math.random()*25000);

        for (int i = 0; i < arrayThree.length - randomPercentage; i++)
        {
            arrayThree[i] = (int)(Math.random()*100000);
        }

        System.out.println("Sorting...");
        Methods.intSort(arrayThree);
        System.out.println("Sorted.");

        int median = array.length/2;
        System.out.println("The median of your mostly sorted array is " + arrayThree[median]);
    }
    //---
    */

    /*
    //Challenge 4. Remove the comment syntax above and below to test the script.
    //---
    public static void main(String[] args)
    {
        Methods exerciseFour = new Methods();

        int[][] arrayFour = new int[1000][1000];
        for (int i = 0; i < arrayFour.length; i++)
        {
            for (int j = 0; j < arrayFour[i].length; j++)
            {
                arrayFour[i][0] = (int)(Math.random()*10000);
                arrayFour[i][j] = (int)(Math.random()*10000);
            }
        }

        Methods.intTwoDimensionSort(arrayFour);

        int median = arrayFour[500][500]/2;

        System.out.println("The median of the median is " + median);
    }
    //---
    */
}
