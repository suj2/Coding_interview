package Data_Structures.SingleLL;
import java.util.Arrays;

public class AllStrings {

    public int A[] ;
    public AllStrings(int n)

    {
        A = new int[n];
    }

    public void binary1(int n)
    {
        if(n <=0)
            System.out.println(Arrays.toString(A));
        else
            A[n-1] = 0;
        binary1(n-1);
        A[n-1] = 1;
        binary1(n-1);
    }

    public static void main(String args[]) throws java.lang.Exception
    {
        int n = 3;
        AllStrings a = new AllStrings(n);
        a.binary1(3);
    }
}
