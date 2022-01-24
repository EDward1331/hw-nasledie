package org.itstep.task04;

import org.itstep.PaymentTypes;
import org.itstep.task03.EmployeeAndChild;

public class EmployeeAndTugrik extends EmployeeAndChild {
    private double tugrickExchange = 0.0;

    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super(fullName,  paymentType, payment);
    }
    public EmployeeAndTugrik(String fullName, String paymentType, double payment,boolean hasChild) {
        super(fullName, paymentType, payment,hasChild);
    }

    public double getTugrickExchange() {
        return tugrickExchange;
    }

    public void setTugrikExchange(double exchangeGet) {
        tugrickExchange = (getPaymentWithTax(getPayment())/2)/exchangeGet;
    }

    @Override
    public String toString(){
        if(tugrickExchange == 0){
            return String.format("%-8s | %-9s | %-11s | %.1fгрн",getFullName(),getTax(),getPayment(),getPaymentWithTax(getPayment()));

        }else{
        return String.format("%-8s | %-9s | %-11s | %.1fгрн / %.1f",getFullName(),getTax(),getPayment(),getPaymentWithTax(getPayment())/2,getTugrickExchange());
        }

    }


}
