package DivideAndConquer;
import java.util.Scanner;

public class PowerN {


    static int pow(int n, int y)
    {
        if(y == 0 )
            return 1;
        if(y%2 == 0)
            return pow(n,y/2)*pow(n,y/2);
        else
            return n*pow(n,y/2)*pow(n,y/2);


    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = s.nextInt();
        int res = pow(n,y);
        System.out.println(res);

    }
}
