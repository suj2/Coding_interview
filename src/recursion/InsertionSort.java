package recursion;
import java.util.Arrays;

public class InsertionSort {

    public void insSort(int arr[])
    {
         for(int i = 1;i< arr.length; i++)
         {
             int key = arr[i];
             int j = i-1;
             while(j >=0 && arr[j] > key)
             {
                 arr[j+1] = arr[j];
                 j = j-1;

             }
             arr[j+1] = key;
         }



    }
    public static void main(String args[])
    {
        int arr[]={3,34,43,23,24343,4535,54454,23232,23,323,242425464,56757787};
        InsertionSort is = new InsertionSort();
        is.insSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
