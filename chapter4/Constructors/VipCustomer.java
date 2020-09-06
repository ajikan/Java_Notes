public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer() {
        this("Default Name", 0d, "Default Email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default Email");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
