package algorithms.SearchingAlgorithms;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbersMicrosoft {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        BigInteger n = new BigInteger(a);
        BigInteger m = new BigInteger(b);
        BigInteger add = n.add(m);
       String v =  add.toString();
      System.out.println(v.length() + "   " + a.length());
        if(v.length() == a.length()) {
        //    System.out.println("inside equal");

            System.out.println(add);
        }
        else
            System.out.println(a);
    }
}