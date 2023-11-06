package Proj17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getSalary());
    }

    public void updateSalary(double salary) {
        model.setSalary(salary);
    }
}

