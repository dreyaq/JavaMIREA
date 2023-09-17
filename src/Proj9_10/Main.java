package Proj9_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(250,"Igor",4.5f));
        students.add(new Student(6078,"Nasty",3.32f));
        students.add(new Student(1,"Sanya",5.0f));
        students.add(new Student(124,"Slava",2.3f));
        students.add(new Student(88,"Alice",2.2745f));

        Collections.sort(students, new SortingStudentsByGPA());

        for (Student student: students)
        {
            System.out.println(student.toString());
        }

        System.out.println(students.get(1).compareTo(students.get(0)));
    }
}
