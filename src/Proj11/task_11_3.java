package Proj11;

import java.util.Date;

public class task_11_3 {
    public static void main(String[] args) {
        Student student = new Student(1254,"Alex",new Date(),3.3);
        System.out.println(student.toString(""));
        System.out.println(student.toString("mid"));
        System.out.println(student.toString("long"));
    }
}
