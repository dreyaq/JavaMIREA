package Proj2_3;

import java.util.Random;

public class task_3_1_3
{
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        Random random = new Random();
        for (int i = 0 ; i<arr.length;i++)
        {
            arr[i]=random.nextInt(10,99+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k=0;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]<arr[i+1]) k++;
        }
        if (k+1==arr.length) System.out.println("Массив строго возрастающий");
        else System.out.println("Массив невозрастающий");

    }
}
