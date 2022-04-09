package org.milan;

public class SBI implements Bank {
    @Override
    public void interestRate() {
        System.out.println("SBI Interest Rate!");
    }

    @Override
    public void loanAmt() {
        System.out.println("SBI Loan Amount");
    }
}
