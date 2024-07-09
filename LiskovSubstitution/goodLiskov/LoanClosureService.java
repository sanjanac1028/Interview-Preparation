package org.example.DesignPatterns.LiskovSubstitution.goodLiskov;

public class LoanClosureService {
    private  SecureLoan secureLoan;
    public  LoanClosureService(SecureLoan secureLoan)
    {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan(){
        secureLoan.foreCloseLoan();
    }
}
