package org.example.DesignPatterns.LiskovSubstitution.badLiskov;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }
    @Override
    public void foreCloseLoan() {
    throw new UnsupportedOperationException("Fore Closure is not allowed");
    }

    @Override
    public void doRepayment(int amount) {
        throw  new UnsupportedOperationException("Repayment is not allowed");
    }
}
