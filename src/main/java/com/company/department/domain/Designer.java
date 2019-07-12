package com.company.department.domain;

public class Designer extends Employee {

    private int coeficient;

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public double getPayment(){
        setSalary(super.getPayment() * coeficient);
        return getSalary();
    }
}
