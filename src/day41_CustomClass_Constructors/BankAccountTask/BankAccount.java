package day41_CustomClass_Constructors.BankAccountTask;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;

    public BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public double deposit(double deposit){
        if (deposit < 0){
            System.out.println("Invalid input");
            return balance;
        }
        System.out.println("Depositing $" + deposit + " to account number: " + accountNumber);
        return balance += deposit;
    }

    public double withdraw(double withdraw){
        if (withdraw <= 0){
            System.out.println("Invalid input");
            return balance;
        }
        if (withdraw > balance){
            balance -= 35;
        }
        System.out.println("Withdrawing $" + withdraw + " from account number: " + accountNumber);
        return balance -= withdraw;

    }


    public void checkBalance(){
        System.out.println("Balance: $" + balance);
    }



}
