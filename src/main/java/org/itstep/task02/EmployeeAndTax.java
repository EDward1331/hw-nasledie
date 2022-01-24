package org.itstep.task02;

import org.itstep.PaymentTypes;
import org.itstep.task01.Employee;

public class EmployeeAndTax extends Employee {
    private double tax;

    public EmployeeAndTax(String fullName, String paymentType, double payment,double tax) {
        super(fullName, paymentType, payment);
        this.tax=tax;
    }
    public EmployeeAndTax(String fullName, String paymentType, double payment){
        super (fullName, paymentType, payment);
        if(paymentType.equals(PaymentTypes.HOURLY)){
            tax = 20;
        }else{
            tax = 15;
        }
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPaymentWithTax(double payment){
        double sum;
        sum = payment - payment*(tax/100);
        return sum;
    }

    @Override
    public String toString(){

        return String.format("%-8s | %-9s | %-11s | %.1fгрн",getFullName(),tax,getPayment(),getPaymentWithTax(getPayment()));
    }

}
