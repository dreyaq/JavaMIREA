package Proj2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task_3_1_4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        do
        {
            System.out.print("Введите натуральное число: ");
            n = scan.nextInt();
        } while (n<1);
        int[] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<Integer>();
        Random random = new Random();
        System.out.print("Массив из n случайных целых чисел из отрезка [0; n]: ");
        for (int i = 0 ; i<arr.length;i++)
        {
            arr[i]=random.nextInt(0,n+1);
            System.out.print(arr[i] + " ");
            if (arr[i]%2==0) even.add(arr[i]);
        }
        System.out.print("\nМассив только из чётных элементов: ");
        for (int i=0; i<even.size();i++)
        {
            System.out.print(even.get(i) + " ");
        }
    }
}
