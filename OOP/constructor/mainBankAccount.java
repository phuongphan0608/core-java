package constructor;

public class mainBankAccount {

    public static void main(String[] args) {

        // Bank Account
//        bankAccount bobAccount = new bankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "(007) 123-4567");
//        System.out.println(bobAccount.getAccountNumber());
//        System.out.println(bobAccount.getBalance());
//
//        bankAccount emilyAccount = new bankAccount("Emily", "emily@gmail.com", "12378");
//        System.out.println(emilyAccount.getBalance());
//        System.out.println(emilyAccount.getCustomerName());
//        System.out.println(emilyAccount.getAccountNumber());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        // VipCustomer
        vipCustomer vipCus = new vipCustomer();
        System.out.println("Default name is: " + vipCus.getName()  +
                "\nDefault credit limit is: " + vipCus.getCreditLimit() +
                "\nDefault email is: " + vipCus.getEmail());
        vipCustomer vipCus1 = new vipCustomer(10000, "andrewdinh@mail.com");
        System.out.println("Name is: " + vipCus1.getName()  +
                "\nCredit limit is: " + vipCus1.getCreditLimit() +
                "\nEmail is: " + vipCus1.getEmail());

        vipCustomer vipCus3 = new vipCustomer("Anna",10000,"annaNganDinh@gmail.com");
        System.out.println("Name is: " + vipCus3.getName()  +
                "\nCredit limit is: " + vipCus3.getCreditLimit() +
                "\nEmail is: " + vipCus3.getEmail());
    }
}
