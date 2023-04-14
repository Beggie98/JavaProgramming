package day41_CustomClass_Constructors.BankAccountTask;

public class BankAccountObject {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Bekzod Juraev",123);
        account1.deposit(7500);
        account1.checkBalance();
        account1.withdraw(4500);
        account1.checkBalance();
        account1.deposit(500);
        account1.checkBalance();
        account1.withdraw(5500);

        account1.checkBalance();


    }
}
