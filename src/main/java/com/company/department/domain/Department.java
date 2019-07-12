package com.company.department.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {

    public List<Manager> managers = new ArrayList<>();

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public void addManager(Manager manager){
        managers.add(manager);
    }

    public void removeManager(Manager manager){
        managers.remove(manager);
    }

    public void paySalary(Employee employee){
        employee.getPayment();
        System.out.println("@" + employee.getFirstName() + "@ @" + employee.getSecondName() +
                "@ @: got salary: @" + employee.getSalary() + "@");
    }
}
