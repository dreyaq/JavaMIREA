package Proj9_10;

public class TestStudentSort {
    public static void insertionSort(Student[] students)
    {
        for (int i=1;i<students.length;i++)
        {
            Student key = students[i];
            int j=i-1;
            while (j>=0 && students[j].getIDNumber()>key.getIDNumber())
            {
                students[j+1]=students[j];
                j--;
            }
            students[j+1]=key;
        }
    }

    public static void main(String[] args) {
        Student[] students =
                {
                        new Student(250,"Igor"),
                        new Student(6078,"Nasty"),
                        new Student(1,"Sanya"),
                        new Student(124,"Slava"),
                        new Student(88,"Alice")
                };
        insertionSort(students);
        for (Student student: students)
        {
            System.out.println(student);
        }
    }
}
