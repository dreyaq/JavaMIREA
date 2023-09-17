package Proj2_3;

public class task_3_3
{
    public static void main(String[] args)
    {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Сергей", 6263.1222145f);
        arr[1] = new Employee("Василий", 50000.512f);
        arr[2] = new Employee("Пётр", 701122.f);
        Report report = new Report();
        Report.generateReport(arr);
    }
}
