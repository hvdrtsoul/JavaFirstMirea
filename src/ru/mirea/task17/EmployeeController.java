package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name) {
        model.setNameSurname(name);
    }
    public String getEmployeeName() {
        return model.getNameSurname();
    }
    public void setEmployeeId(int id) {
        model.setId(id);
    }
    public int getEmployeeId() {
        return model.getId();
    }
    public void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }
    public int getEmployeeSalary() {
        return model.getSalary();
    }
    public void updateView() {
        view.printEmployeeDetails(model.getNameSurname(), model.getId(), model.getSalary());
    }
}
