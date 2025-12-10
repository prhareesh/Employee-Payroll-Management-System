package com.wipro.eps.entity;

public class PayrollRule {
    private double taxPercentage;
    private double pfPercentage;
    private  double otherDeductionsPercentage;

    public PayrollRule() {

    }

    public PayrollRule(double taxPercentage, double pfPercentage, double otherdeductionsPercentage) {
        this.taxPercentage = taxPercentage;
        this.pfPercentage = pfPercentage;
        this.otherDeductionsPercentage = otherdeductionsPercentage;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getPfPercentage() {
        return pfPercentage;
    }

    public void setPfPercentage(double pfPercentage) {
        this.pfPercentage = pfPercentage;
    }

    public double getOtherDeductionsPercentage() {
        return otherDeductionsPercentage;
    }

    public void setOtherDeductionsPercentage(double otherDeductionsPercentage) {
        this.otherDeductionsPercentage = otherDeductionsPercentage;
    }
}
