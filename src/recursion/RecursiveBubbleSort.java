package recursion;
import java.util.Arrays;

public class RecursiveBubbleSort {

    public void recursiveBS(int arr[], int n)
    {

        if(n == 1)
        {
            return ;
        }

        for(int i =0;i< n-1;i++)
        {
            if(arr[i] > arr[i+1] )
            {
                int temp = arr[i];
                arr[i] = arr[i+1] ;
                arr[i+1] = temp;
            }
        }

        recursiveBS(arr, n-1);


    }

    public static void main(String args[])
    {
        int arr[] = {43,54,65,23,-43,54,78,5,67,0,98,-34,-111,54};
        RecursiveBubbleSort rs = new RecursiveBubbleSort();
        rs.recursiveBS(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        return ;
    }


}
