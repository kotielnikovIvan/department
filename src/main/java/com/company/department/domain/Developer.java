package com.company.department.domain;

public class Developer extends Employee {

    @Override
    public boolean isTeamMember() {
        return true;
    }
}