package Proj8;

import java.util.Scanner;
import java.util.SortedMap;

import static java.lang.Math.pow;

public class Main {

    public static int countOnes()
    {
        int a = new Scanner(System.in).nextInt();
        if (a == 0)
        {
            a = new Scanner(System.in).nextInt();
            if (a==0) return 0;
            if (a==1) return a+ countOnes();
            countOnes();
        }
        if (a==1) return a + countOnes();
        return countOnes();
    }
    public static int reverse(int n)
    {
        if (n/10!=0) return n%10 * (int) (pow(10,(String.valueOf(n).length())-1)) + reverse(n/10);
        return n;
    }
    public static String oddNumbers()
    {
        String a = new Scanner(System.in).nextLine();
        if (a.equals("0")) {
            return "";
        }
        if ((Integer.valueOf(a))%2!=0) {
            return a + " " + oddNumbers();
        }
        return oddNumbers();
    }
    public static void main(String[] args) {

        ///System.out.println(reverse(259));
        ///System.out.println(countOnes());
        System.out.println(oddNumbers());
    }
}
