package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        model.setName(name);
    }

    public String getName(){
        return model.getName();
    }

    public void setId(int id){
        model.setId(id);
    }

    public int getId(){
        return model.getId();
    }

    public void setSalary(int salary){
        model.setSalary(salary);
    }

    public int getSalary(){
        return model.getSalary();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getId(), model.getSalary());
    }
}
