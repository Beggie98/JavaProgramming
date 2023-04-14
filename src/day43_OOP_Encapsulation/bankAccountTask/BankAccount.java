package day43_OOP_Encapsulation.bankAccountTask;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;


    public BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public double deposit(double deposit){
        if (deposit < 0){
            System.err.println("Deposit amount cannot be negative");
            return balance;
        }
        System.out.println("Depositing $" + deposit + " to account number: " + accountNumber);
        return balance += deposit;
    }

    public double withdraw(double withdraw){
        if (withdraw < 0){
            System.err.println("Withdrawal amount cannot be negative");
            return balance;
        }
        System.out.println("Withdrawing $" + withdraw + " from account number: " + accountNumber);
        return balance -= withdraw;
    }

    public void checkBalance(){
        System.out.println(accountNumber + "'s balance is: $" + balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
