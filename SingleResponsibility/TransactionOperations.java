package org.example.DesignPatterns.SingleResponsibility;

public class TransactionOperations {

    public void deposit(double amount,int accNo)
    {
        AccountOperations accountOperations = new AccountOperations();
        Account account =accountOperations.getAccount(accNo);
        account.setTotalAmount(account.getTotalAmount()+amount);
        System.out.println(account);
    }
       public void withdraw(double amount , int accNo)
       {
           AccountOperations accountOperations = new AccountOperations();
           Account account = accountOperations.getAccount(accNo);
           account.setTotalAmount(account.getTotalAmount()-amount);

       }
}
