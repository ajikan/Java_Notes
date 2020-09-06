public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Java creates empty constructor by default
    // But here we've created our own.
    public BankAccount() {
        // Use this() to call constructor within another constructor.
        // Has to be the first statement or else ERROR. 
        this("1234567", 0d, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called");
    }

    // Constructors can be overloaded: different number
    // of parameters
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called.");
        // Good rule: don't call setters/other methods in constructors other than
        // other constructors. When subclassing, there are scenrios where statements in methods 
        // don't get executed. Initialization of object might not be complete yet so not a 
        // good idea to call methods.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Good practice: Have one constructor that initializes the fields and other
    // constructors call that one constructor.
    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100d, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount of " + depositAmount + " made. New balance = " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdraw not processed.");
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw amount of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }



}
