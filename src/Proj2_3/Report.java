package Proj2_3;

public class Report
{
    static void generateReport(Employee[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("Зарплата сотрудника " + arr[i].fullname + " составляет: ");
            System.out.printf("'%10.2f'%n", arr[i].salary);
        }
    }
}
