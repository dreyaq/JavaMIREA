package Proj11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;

    private Date dateOfBirth;

    private double GPA = 0;


    public Student(int iDNumber, String name, Date dateOfBirth, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

    public String toString(String s) {
        if (s=="long") {
            return "Student{" +
                    "iDNumber=" + iDNumber +
                    ", name='" + name + '\'' +
                    ", dateOfBirth=" + (new SimpleDateFormat(("EEEE, MMMM d, yyyy")).format(dateOfBirth)) +
                    ", GPA=" + GPA +
                    '}';
        }
        else if (s=="mid")
        {
            return "Student{" +
                    "iDNumber=" + iDNumber +
                    ", name='" + name + '\'' +
                    ", dateOfBirth=" + (new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz")).format(dateOfBirth) +
                    ", GPA=" + GPA +
                    '}';
        }
        else
        {
            return "Student{" +
                    "iDNumber=" + iDNumber +
                    ", name='" + name + '\'' +
                    ", dateOfBirth=" + (new SimpleDateFormat("E, y-M-d 'at' h:m:s a z")).format(dateOfBirth) +
                    ", GPA=" + GPA +
                    '}';
        }
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.iDNumber,otherStudent.iDNumber);
    }
}
