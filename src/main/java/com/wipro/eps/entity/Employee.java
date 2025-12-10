package com.wipro.eps.entity;

public class Employee {
    private String employeeId;
    private String name;
    private String designation;
    private String grade;
    private double basicSalary;
    private double hra;
    private double otherAllowance;

    public Employee() {
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGrade() {
        return grade;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public double getOtherAllowance() {
        return otherAllowance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setOtherAllowance(double otherAllowance) {
        this.otherAllowance = otherAllowance;
    }
}
