package com.company.department.domain;

import com.company.department.domain.Developer;
import com.company.department.domain.Employee;

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

    public void addToTeamm(Employee employee){
        if(employee instanceof Designer || employee instanceof Developer)
        team.add(employee);
    }

    public void removeFromTeam(Employee employee){
        team.remove(employee);
    }

    public double getPayment() {

        int amountOfDevelopers = countDevelopers();
        if (team.size() > 5 && team.size() < 10) {
            setSalary(super.getPayment() + 200);
        } else if (team.size() > 10) {
            setSalary(super.getPayment() + 300);
        } else if (amountOfDevelopers > (team.size() / 2)) {
            setSalary(super.getSalary() * 1.1);
        }
        return getSalary();
    }

    private int countDevelopers(){
        int amountOfDevelopers = 0;
        for (Employee emp : team) {
            amountOfDevelopers = emp instanceof Developer ? amountOfDevelopers++ : amountOfDevelopers;
        }
        return amountOfDevelopers;
    }

}
