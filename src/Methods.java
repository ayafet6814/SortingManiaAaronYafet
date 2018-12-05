public class Methods
{
	public static void stringSwap(String[] string, int j, int k)
    {
        String hold = string[k];
        string[k] = string[j];
        string[j] = hold;
    }
    public static void intSwap(int[] array, int j, int k)
    {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }

    (Arrays.deepToString());

    //main reliable sorting method
    public static void intSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {

            int minI = i;

            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] < array[minI])
                {
                    minI = j;
                }
            }

            intSwap(array, i, minI);

        }
    }
    public static void stringSort(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int low = i;

            for (int j = i+1; j < array.length; j++)
            {
                if (array[j].compareTo(array[low]) < 0)
                {
                    stringSwap(array, low, j);
                }
            }
        }
    }
    public static void intTwoDimensionSort(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int minI = i;

            for (int j = i+1; j < array.length; j++)
            {
                if (array[i][j] < array[i][minI])
                {
                    minI = j;
                }
            }

            intSwap(array[i], i, minI);
        }
    }
}
