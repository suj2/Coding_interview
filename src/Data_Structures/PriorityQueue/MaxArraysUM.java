package Data_Structures.PriorityQueue;

import java.util.PriorityQueue;

import java.util.Scanner;
public class MaxArraysUM {

    static int  maxSum(int arr[], int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:arr)
        {
            pq.add(x);
        }
        while(k> 0 )
        {
            k--;
            int temp = pq.poll();
            System.out.print(temp + "  ");
            temp = -temp;
            pq.add(temp);

        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.remove();
        }


System.out.println(sum);

        return sum;

    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        s.close();
        int arr[] = {34,22,11,-45,-33,0,21};
        int c = maxSum(arr, k);
        System.out.println(c + " ");


    }
}
