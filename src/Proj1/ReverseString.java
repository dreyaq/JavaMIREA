package Proj1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[4-i]=scan.nextLine();
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
