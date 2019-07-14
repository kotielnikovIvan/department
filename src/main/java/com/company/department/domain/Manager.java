package com.company.department.domain;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> team = new ArrayList<>();

    public List<Employee> getTeam() {
        return team;
    }

    public void setTeam(List<Employee> team) {
        this.team = team;
    }

    @Override
    public boolean isTeamMember() {
        return false;
    }

    public void addToTeam(Employee employee) {
        if (employee.isTeamMember())
            team.add(employee);
    }

    public void removeFromTeam(Employee employee) {
        if (!team.isEmpty() && team != null)
            team.remove(employee);
    }

    public int getPayment() {
        int amountOfDevelopers = countDevelopers();
        if (team.size() <= 5 && amountOfDevelopers <= team.size() / 2)
            return super.getPayment();

        int salary = super.getPayment();
        salary = (team.size() > 5 && team.size() <= 10) ? salary + 200 : salary + 300;
        setSalary(salary);

        if (amountOfDevelopers > team.size() / 2)
            setSalary((int) (salary * 1.1));
        return getSalary();
    }

    private int countDevelopers() {
        int amountOfDevelopers = 0;
        for (Employee emp : team) {
            amountOfDevelopers = emp instanceof Developer ? amountOfDevelopers++ : amountOfDevelopers;
        }
        return amountOfDevelopers;
    }
}
