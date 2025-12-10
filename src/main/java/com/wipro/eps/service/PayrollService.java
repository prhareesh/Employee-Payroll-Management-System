package com.wipro.eps.service;

import com.wipro.eps.entity.Employee;
import com.wipro.eps.entity.PayrollRule;
import com.wipro.eps.entity.Payslip;
import com.wipro.eps.util.InvalidEmployeeException;
import com.wipro.eps.util.SalaryComputationException;

import java.util.ArrayList;

public class PayrollService {

    private ArrayList<Employee> employees;
    private PayrollRule rule;

    public PayrollService(ArrayList<Employee> employees, PayrollRule rule) {
        this.employees = employees;
        this.rule = rule;

    }

    public boolean validateEmployee(String employeeId) throws InvalidEmployeeException {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return true;
            } else {
                throw new InvalidEmployeeException();
            }
        }
        return false;
    }

    public Employee findEmployee(String employeeId) throws InvalidEmployeeException {

        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        throw new InvalidEmployeeException();
    }

    public double calculateGrossSalary(Employee employee) throws SalaryComputationException {
        double gross = employee.getBasicSalary() + employee.getHra() + employee.getOtherAllowance();
        return gross;
    }
    public double calculateTotalDeductions(double gross,Employee emp) throws SalaryComputationException{
        double totalDeductions = (gross/100)*rule.getTaxPercentage()+(gross/100)*rule.getPfPercentage()+(gross/100)*rule.getOtherDeductionsPercentage();
        if(totalDeductions>gross){
            throw new SalaryComputationException();
        }
        return totalDeductions;
    }


    public Payslip generatePayslip(String employeeId, String month) throws Exception {
        Payslip payslip=new Payslip();
        Employee e=findEmployee(employeeId);
        payslip.setEmployeeId(employeeId);
        payslip.setGrossSalary(calculateGrossSalary(e));
        payslip.setTotalDeductions(calculateTotalDeductions(payslip.getGrossSalary(),e));
        payslip.setNetSalary(payslip.getGrossSalary()-payslip.getTotalDeductions());
        payslip.setMonth(month);
        return payslip;
    }
    public ArrayList<Payslip> processMonthlyPayroll(ArrayList<String> employeeIds, String month) throws Exception {
        ArrayList<Payslip> payslips=new ArrayList<>();
        for(String e : employeeIds) {
            payslips.add(generatePayslip(e,month));
        }
        return payslips;
    }


}


