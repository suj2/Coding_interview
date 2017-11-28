package Data_Structures.PriorityQueue;

import java.util.PriorityQueue;

public class MinumumApples {

    static int  heaps1(int arr[])
    {
        int m,n;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int p:arr)
        {
            pq.add(p);
        }
        int shift = 0;
        for(int i = 0; i <arr.length-1;i++)
        {
            m = pq.poll();
            n = pq.poll();
            shift = shift+Math.max(m,n);
            pq.add(m+n);

        }
        return shift;




    }


    public static void main(String args[])
    {
        int arr[] = {1,2,3,6,7};
        System.out.println(heaps1(arr));

    }
}
