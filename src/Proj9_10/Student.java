package Proj9_10;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;

    private double GPA = 0;


    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public Student(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.iDNumber,otherStudent.iDNumber);
    }
}
