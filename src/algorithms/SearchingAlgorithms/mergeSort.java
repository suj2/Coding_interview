package algorithms.SearchingAlgorithms;

public class mergeSort {
    public void merge(int arr[], int l, int mid, int r)
    {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        System.out.println(l + " " + mid + " " + r );
        System.out.println( n1 + "   " + n2);
        for(int i = 0; i < n1; i++)
        {
            left[i] = arr[l+i];
            System.out.println("left is "  + left[i]  + "from l " + l);

        }
        for(int j = 0; j< n2; j++)
        {
            right[j] = arr[mid+1+j];
            System.out.println("left is "  + right[j]+ " from mid and j " + mid + j  );
        }

        int i=0,j=0;
        int k = l;
        if(i< n1 && j < n2)
        {
            if(left[i] <=right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;

            }



            k++;
            while(i<n1)
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                arr[k] = right[j];
                j++;
                k++;
            }

        }

    }


    public void sort(int arr[],int l ,int r)
    {

        if(l<r)
        {
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);

        }

    }
    public static void main(String args[])
    {
        int arr[] = {43,54,76,-43,32,-23,768,654,-32,9,332,-5};
        mergeSort m = new mergeSort();
        m.sort(arr,0,arr.length-1);
    }
}
