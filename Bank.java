abstract class BankAccount {
    private String accNo;
    private double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    void setbalance(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}

class SavingAccount extends BankAccount {

    public SavingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void deposit(double amount) {
        setbalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + "successful.....Current Balance $" + getBalance());

    }

    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setbalance(getBalance() - amount);
            System.out.println("Withdraw of $" + amount + "successful......Current balance $" + getBalance());
        } else {
            System.out.println("insufficient amount......");
        }
    }

}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void deposit(double amount) {
        setbalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + "successful. current balance :$" + getBalance());
    }

    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setbalance(getBalance() - amount);
            System.out.println("withdraw of $" + amount + "successful. current balance :$" + getBalance());
        } else {
            System.out.println("insufficient amount..........");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        double rupees = 10000;
        double ibal, damt;
        SavingAccount s1 = new SavingAccount("Sohail", rupees);
        System.out.println("Initial Balance :$" + rupees);
        damt = 5000;
        s1.deposit(damt);
        s1.withdraw(damt);
        System.out.println();
        ibal = 5000;
        CurrentAccount c1 = new CurrentAccount("Haresh", ibal);
        System.out.println("Initial Balance is $" + ibal);
        // double damt=2500;
        c1.deposit(damt);
        double wamt = 500;
        c1.withdraw(wamt);

    }
}
