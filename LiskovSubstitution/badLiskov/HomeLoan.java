package org.example.DesignPatterns.LiskovSubstitution.badLiskov;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}
