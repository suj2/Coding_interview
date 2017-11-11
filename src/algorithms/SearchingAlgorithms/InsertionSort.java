package algorithms.SearchingAlgorithms;

 import java.util.Arrays;
public class InsertionSort {
    public void recursive(int arr[], int len)
    {
        System.out.println(len);

        if(len <=1)
            return;

            recursive(arr ,len-1);
            int last = arr[len-1];
            int j = len-2;
        System.out.println(last);

        while(j>=0 && arr[j] > last )

            {
                arr[j+1] = arr[j];
                j--;
                System.out.println(arr[j+1]);

        }
    arr[j+1] = last;






    }

    public static void main(String args[])
    {
        int arr1[] = {32,43,23,-89,-90,-12,0,889,32,54};
        InsertionSort a = new InsertionSort();
        a.recursive(arr1, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }
}
