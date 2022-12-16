package ru.mirea.task17;

public class Main {
    public static void main(String[] args) {
        Employee model = getEmployee();
        // Create a view : to write employee details on console
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        // Update model data
        controller.setEmployeeName("Furleb Duyarov");
        controller.setEmployeeId(99);
        controller.setEmployeeSalary(99999999);
        controller.updateView();
    }

    private static Employee getEmployee() {
        Employee employee = new Employee("Furkan Duyan", 3, 9999999);
        return employee;
    }
}
