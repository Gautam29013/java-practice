import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNo, String type, double balance) {
        this.customerName = name;
        this.accountNumber = accNo;
        this.accountType = type;
        this.balance = balance;
    }

 
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    void displayBalance() {
        System.out.println("Name: " + customerName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    double interestRate; // e.g. 5%

    SavAcct(String name, int accNo, double balance, double rate) {
        super(name, accNo, "Savings", balance);
        this.interestRate = rate;
    }

    void computeInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

    CurrAcct(String name, int accNo, double balance, double minBal, double charge) {
        super(name, accNo, "Current", balance);
        this.minBalance = minBal;
        this.serviceCharge = charge;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);

            if (balance < minBalance) {
                balance -= serviceCharge;
                System.out.println("Below minimum balance! Service charge: " + serviceCharge);
            }
        } else {
            System.out.println("Not enough balance!");
        }
    }

    void computeInterest() {
        System.out.println("Current account has no interest.");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SavAcct savings = new SavAcct("Jony Gautam", 101, 5000, 5.0);
        CurrAcct current = new CurrAcct("Ravi Sharma", 102, 8000, 2000, 500);


     
        savings.deposit(2000);
        savings.computeInterest();
        savings.withdraw(3000);
        savings.displayBalance();

        current.deposit(1000);
        current.withdraw(7500);
        current.displayBalance();

        sc.close();
    }
}
