package ru.mirea.task17;

public class MVCDemo {
    public static void main(String[] args) {
        Employee model = getEmployee();

        EmployeeView view = new EmployeeView();
        EmployeeController contoller = new EmployeeController(model, view);
        contoller.updateView();

        contoller.setId(3);
        contoller.setName("gera");
        contoller.setSalary(contoller.getSalary() + 999);

        contoller.updateView();
    }

    private static Employee getEmployee(){
        Employee result = new Employee("german marov", 2, 6666669);
        return result;
    }
}
