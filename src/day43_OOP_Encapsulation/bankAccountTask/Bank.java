package day43_OOP_Encapsulation.bankAccountTask;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bekzod",101);

        account1.deposit(15000);
        account1.withdraw(7000);
        account1.deposit(5000);

        account1.checkBalance();
        System.out.println(account1);

    }
}
