package Proj1;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String[] parts = string.split(" ");
        if (string.length()!=0) System.out.println(parts.length);
        else System.out.println(0);

    }
}
