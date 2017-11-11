package algorithms.SearchingAlgorithms.DutchSorting;

public class DutchSorting01 {

    int[] sort(int a[])
    {
        int l = 0, r = a.length-1;
        while(l<r)
        {
            if(a[l] == 3) {
                l++;
                continue;
            }
            if(a[r] == 5)
            {
                r--;
                continue;
            }
            else
            {
                int t = a[l];
                a[l] = a[r];
                a[r] = t;
            }
        }
        return a;

    }

    public static void main(String args[])
    {


        int[] arr = new int[] { };
        DutchSorting01 D = new DutchSorting01();


        int[] b;
        b = D.sort(arr);
        for(int v:b)
        {
            System.out.println(v + " ");
        }


    }

}
