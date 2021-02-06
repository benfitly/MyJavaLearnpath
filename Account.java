/*
    Create a new class for a bank account named Account.
    Create fields for the account number, balance, customer name, email and
    phone number.

    Create getters for each field.
    Create two additional methods:
        1. To allow the customer to deposit funds (this should increment the balance field).
        2. To allow the customer to withdraw funds. This should deduct from
        the balance field, but not allow the withdrawal to complete if their
        are insufficient funds.
    You will want to create various code in the Main class to confirm your
    code is working.

*/
public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("11111", 1.00, "Default name", "Default address", "default phone");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "€ made. New balance is "
                            + this.balance + "€");
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + "€ available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +
                "€ processed, Remaining balance = " + this.balance + "€");
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    //Test code
    public static void main(String[] args){

        Account faycal = new Account("300455655", 300.0, "Faycal Benfatah", "f.benf@gmx.de",
        "01728139803");

        System.out.println("Account Holder: " + faycal.getCustomerName());
        System.out.println("Account No: " + faycal.getNumber());
        System.out.println("Balance Now: " + faycal.getBalance());

        faycal.withdrawal(500.0);
        faycal.deposit(300.0);
        faycal.withdrawal(500.0);

    }
}
