package algorithms.SearchingAlgorithms;

import java.util.Arrays;

public  class BubbleSort {

    public static void sort(int arr[])
    {
        int temp;
        int swap = 0;
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0 ; j < arr.length-1-i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                      temp = arr[j+1];
                      arr[j+1] = arr[j];
                      arr[j] = temp;
                      swap = 1;
                }
                if(swap == 0)
                {
                    System.out.println("All sorted");

                    break ;
                }
            }
        }
    }

    public static void main(String args[])
    {
        int abc[] = {-43,-34,-22,0,45,67,89,99,899};
        sort(abc);
        System.out.println(Arrays.toString(abc));
    }
}
