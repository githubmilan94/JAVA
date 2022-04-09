package org.milan;

public class MainClass {

    public static void main(String[] args) {
        Bank HDFCbank = new HDFC();
        HDFCbank.interestRate();
        HDFCbank.loanAmt();


        Bank SBIbank = new SBI();
        SBIbank.interestRate();
        SBIbank.loanAmt();
    }
}
