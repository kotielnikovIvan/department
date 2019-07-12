package com.company.department.domain;

public abstract class Employee {

    private String firstName;
    private String secondName;
    private double salary;
    private float experiance;
    private Manager manager;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getExperiance() {
        return experiance;
    }

    public void setExperiance(float experiance) {
        this.experiance = experiance;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String toString(){
        return "@" + firstName + "@ @" + secondName + "@ @, manager:@manager " +
                manager.getSecondName() + "@, experiance:@" + experiance + "@";
    }

    public double getPayment(){
        if (experiance > 2 && experiance <= 5){
            salary = salary + 200;
        }
        else if(experiance > 5){
            salary = salary * 1.2 + 500;
        }
        return salary;
    }
}
