package algorithms.SearchingAlgorithms;

import java.util.Scanner;


public class PenaltiesMicrosoft
{
    /* static int sum = 0;
    static int sumOfPenalty(int num)
    {
        sum = sum+num;
        return sum ;
    }*/

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0)

        {
            int n = 0;
            int date = 0;
            testCases--;
            if (sc.hasNextInt())
                n = sc.nextInt();
            int carNo[] = new int[n];

            int penalty[] = new int[n];
            if (sc.hasNextInt())
                date = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt())
                    carNo[i] = sc.nextInt();


            }
            int flag = 0;
            for (int i = 0; i < n; i++) {

                if (sc.hasNextInt())
                    penalty[i] = sc.nextInt();
            }
            sc.close();
            //    int decDate = (date%2 == 0)? 1:0;


            int total = 0;

            for (int var = 0; var < n; var++) {
                if (date % 2 == 0) {
                    if (carNo[var] % 2 == 0)
                        total += penalty[var];
                } else if (carNo[var] % 2 != 0)
                    total += penalty[var];
                System.out.println(total);


            }
        }
    }
}
