package algorithms.SearchingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int  arr[])
    {
        int min_num = 0;
        int temp;
        for(int i = 0;i< arr.length-1;i++)
        {
            min_num = i;
          for(int j = i+1; j<arr.length; j++)
          {
              if(arr[j] <arr[min_num]) {
                  min_num = j;

                  temp = arr[i];
                  arr[i] = arr[min_num];
                  arr[min_num] = temp;
              }

          }



    }
    }

    public static void main(String args[])
    {
        int arr[] = {54,65,23,-55,76,77,545,45,-98,0,87,-32};
        SelectionSort s;
        s = new SelectionSort();
        s.selectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }
}
