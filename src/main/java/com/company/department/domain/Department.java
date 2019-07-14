package com.company.department.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Manager> managers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public void addManager(Manager manager) {
        managers.add(manager);
        manager.setDepartment(this);
    }

    public void removeManager(Manager manager) {
        if (!managers.isEmpty() && managers != null) {
            managers.remove(manager);
        }
    }

    public void addEmployee(Long managerID, Employee employee) {
        if (!managers.isEmpty()) {
            for (Manager manager : managers) {
                if (manager.getId() == managerID) {
                    manager.addToTeam(employee);
                    employee.setDepartment(this);
                }
            }
        }
    }

    public void paySalary(Employee employee) {
        employee.getPayment();
    }

    public void showSalary(Employee employee) {
        System.out.println("@" + employee.getFirstName() + "@ @" + employee.getSecondName() +
                "@ @: got salary: @" + employee.getSalary() + "@");
    }

}
