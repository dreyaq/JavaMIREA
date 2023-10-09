package Proj13;

import java.util.Scanner;

public class task_13_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ((s.length()==11 && s.charAt(0)=='8'))
        {
            System.out.println("+7("+s.substring(1,4)+")"+s.substring(4,7)+"-"+s.substring(7,9)+"-"+s.substring(9,11));
        }
        else if((s.length()>=12 && s.charAt(0)=='+'))
        {
            System.out.println("+"+s.substring(1,s.length()-10)+"("+s.substring(s.length()-10,s.length()-7)+")"+s.substring(s.length()-7,s.length()-4)+"-"+s.substring(s.length()-4,s.length()-2)+"-"+s.substring(s.length()-2,s.length()));
        }
        else
        {
            System.out.println("Неизвестный формат номера");
        }
    }
}
