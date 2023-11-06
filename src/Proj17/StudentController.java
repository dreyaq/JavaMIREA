package Proj17;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    String getStudentName()
    {
        return model.getName();
    }

    void setStudentName(String name)
    {
        model.setName(name);
    }

    String getStudentRollNo()
    {
        return model.getRollNo();
    }

    void setStudentRollNo(String rollNo)
    {
        model.setRollNo(rollNo);
    }

}
