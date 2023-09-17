package Proj9_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2)
    {
        List<Student> mergedList = new ArrayList<>();
        int i=0,j=0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getIDNumber() < list2.get(j).getIDNumber()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        students1.add(new Student(250,"Igor",4.5f));
        students1.add(new Student(6078,"Nasty",3.32f));
        students1.add(new Student(1,"Sanya",5.0f));
        students2.add(new Student(124,"Slava",2.3f));
        students2.add(new Student(88,"Alice",2.2745f));
        Collections.sort(students1,(s1, s2) -> Integer.compare(s1.getIDNumber(), s2.getIDNumber()));
        Collections.sort(students2,(s1, s2) -> Integer.compare(s1.getIDNumber(), s2.getIDNumber()));
        List<Student> mergedList =  mergeSort(students1,students2);
        for (Student student: mergedList)
        {
            System.out.println(student.toString());
        }

    }
}
