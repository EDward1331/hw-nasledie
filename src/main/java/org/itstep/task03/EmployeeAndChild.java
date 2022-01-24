package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndChild extends EmployeeAndTax {
    private boolean hasChild = true;

    public EmployeeAndChild(String fullName, String paymentType, double payment){
        super(fullName, paymentType, payment);
        setTax(getTax()+5);
    }

    public EmployeeAndChild(String fullName, String paymentType, double payment,boolean hasChild) {
        super(fullName, paymentType, payment);
        this.hasChild=hasChild;
        if(!hasChild){
            setTax(getTax()+5);
        }
    }

    public boolean isHasChild() {
            return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }
    @Override
    public String toString(){
        return String.format("%-8s | %-9s | %-11s | %.1fгрн",getFullName(),getTax(),getPayment(),getPaymentWithTax(getPayment()));
    }
}
