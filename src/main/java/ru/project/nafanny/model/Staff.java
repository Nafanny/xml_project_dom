package ru.project.nafanny.model;

public class Staff {

    private String name;
    private String role;
    private String salary;
    private String bio;

    public Staff(String name, String role, String salary, String bio) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setBio(String bio) {
        this.bio = bio;
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
