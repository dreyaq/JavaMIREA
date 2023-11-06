package Proj17;

public class MVCPatternDemo {
    static StudentView view = new StudentView();
    static Student student = new Student();
    static StudentController controller = new StudentController(student, view);
    public static void main(String[] args)
    {
        controller.setStudentName("Igor");
        controller.setStudentRollNo("Roll");
        System.out.println(controller.getStudentName());
        System.out.println(controller.getStudentRollNo());
    }
}
