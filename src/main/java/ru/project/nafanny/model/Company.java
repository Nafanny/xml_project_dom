package ru.project.nafanny.model;

import java.util.List;

public class Company {

    private List<Staff> staff;

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return "Company{" +
                "staff=" + staff +
                '}';
    }
}
