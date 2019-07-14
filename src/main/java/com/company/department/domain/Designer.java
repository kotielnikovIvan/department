package com.company.department.domain;

public class Designer extends Employee {

    private boolean coefficient;

    public boolean isCoefficient() {
        return coefficient;
    }

    public void setCoefficient(boolean coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public boolean isTeamMember() {
        return true;
    }

    public int getPayment() {
        if (coefficient) {
            setSalary(super.getPayment() * 1);
            return getSalary();
        }
        setSalary(0);
        return getSalary();
    }
}
