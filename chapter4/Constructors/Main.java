public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account2 = new BankAccount("1234567", 500, "Bob Dylan", "bobdylan@gmail.com", "4089576284");

        account.setAccountNumber("1234567");
        account.setEmail("az410@illinois.edu"); 
        account.setPhoneNumber("4086536958");
        account.setCustomerName("Andrew Zhang");

        account.setBalance(1000);
        account.deposit(500);

        account.withdraw(1600);
        account.withdraw(500);


        VipCustomer cust = new VipCustomer("Andrew", 1000, "az401@illinois.edu");
        VipCustomer cust2 = new VipCustomer();
        VipCustomer cust3 = new VipCustomer("Bob", 500);

        System.out.println("cust2 name = " + cust2.getName());
        System.out.println("cust3 creditLimit = " + cust3.getCreditLimit());
        System.out.println("cust1 email = " + cust.getEmail());


    }
}
