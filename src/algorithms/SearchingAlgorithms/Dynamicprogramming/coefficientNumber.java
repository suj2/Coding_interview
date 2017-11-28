package algorithms.SearchingAlgorithms.Dynamicprogramming;

public class coefficientNumber {

    static int coefficient(int n, int k)
    {
        if(n==k || k==0)
            return 1;
        return coefficient(n-1,k-1) + coefficient(n-1,k);
    }

    public static void main(String args[])
    {
        int n = 5, k = 3;
        System.out.println(coefficient(n,k));

    }
}
