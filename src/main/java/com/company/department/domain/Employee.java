package com.company.department.domain;

public abstract class Employee implements Salary {

    private Long id;
    private String firstName;
    private String secondName;
    private int salary;
    private int experience;
    private Manager manager;
    private Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getPayment() {
        if (experience <= 1) {
            return salary;
        }
        return salary = (experience > 2 && experience <= 5) ? salary += 200 : (int) (salary * 1.2 + 500);
    }

    public abstract boolean isTeamMember();

    @Override
    public String toString() {
        if (manager != null)
            return "@" + firstName + "@ @" + secondName + "@ @, manager:@manager " +
                    manager.getSecondName() + "@, experiance:@" + experience + "@";
        return super.toString();
    }
}
