package org.milan;

public class HDFC implements Bank {

    @Override
    public void interestRate() {
        System.out.println("Interest Rate!");
    }

    @Override
    public void loanAmt() {
        System.out.println("Loan Amount!");
    }
}
