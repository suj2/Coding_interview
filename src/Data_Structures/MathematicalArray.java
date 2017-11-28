package Data_Structures;

import java.util.Scanner;

public class MathematicalArray {

    static void  CheckDivisibility(int num) {
        int n = 0;
        int remainder = 0;
        Scanner a = new Scanner(System.in);
        while(true)
        {



                n = a.nextInt();


                if (n == 1) {
                    remainder = (remainder * 2 + 1) % num;
                    System.out.println("1   " + remainder);
                }
                if (n == 0) {
                    remainder = (remainder * 2) % num;
                    System.out.println("0    " + remainder);
                }
                else break;


                if (remainder == 0) {
                    System.out.println("Yes");

                }
                else System.out.println("No");



        }




        a.close();

    }

    public static void main(String args[])
    {
        CheckDivisibility(7);
        return ;


    }

}
