package org.example.DesignPatterns.SingleResponsibility;

public class MainForThisExmpl {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccNo(123);
        account.setFirstName("Vishrut");
        account.setTotalAmount(1000.00);
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);
        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(500.00,123);
    }
}
