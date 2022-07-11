package ru.project.nafanny.model;

public class Staff {

    private String name;
    private String role;
    private String salary;
    private String bio;

    public Staff(String name, String role, String salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary='" + salary + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
