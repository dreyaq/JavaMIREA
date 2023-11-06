package Proj17;

public class MVCEmployeeExample {
    public static void main(String[] args) {
        Employee model = new Employee("John Doe", 50000.0);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.updateSalary(55000.0);
        controller.updateView();
    }
}