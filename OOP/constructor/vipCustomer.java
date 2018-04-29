package constructor;

public class vipCustomer {

    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.

    private String name;
    private double creditLimit;
    private String email;

    public vipCustomer() {
        this ("Phuong",100000000, "phuongphan0608@gmail.com");
    }

    public vipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public vipCustomer(double creditLimit, String email) {
        this ("Default name",creditLimit,email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}


