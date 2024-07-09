package org.example.DesignPatterns.LiskovSubstitution.badLiskov;

public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}
