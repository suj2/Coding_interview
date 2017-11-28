package algorithms.SearchingAlgorithms.Dynamicprogramming;
import java.util.HashMap;
import java.util.Map;

public class Coefficient {
    static int coefficients(int n, int k)
    {

      int c[][] = new int[n+1][k+1];


        for(int i=0;i<=n;i++)
        {
            for(int j = 0; j<= i && j<=k ;j++)
            {
                if( j == i|| j==0)
                    c[i][j] = 1;
                else
                    c[i][j] = c[i-1][j-1] + c[i-1][j];
            }

        }
        return c[n][k];

    }

    public static void main(String args[])
    {

         int c = coefficients(5,2);
         System.out.println(c);

    }
}
