package SellingBurgers;

public class Hamburger {

    private String name;
    private String meat;
    private String rollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, String rollType, double price) {
        this.name = name;
        this.meat = meat;
        this.rollType = rollType;
        this.price = price;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerprice = this.price;
        System.out.println("Hamburger on a" + this.rollType +" roll " + " with "+ this.meat + ", price is " + this.price );

        if (addition1Name != null){
            hamburgerprice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null){
            hamburgerprice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }

        if (addition3Name != null){
            hamburgerprice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }

        if (addition4Name != null){
            hamburgerprice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        return hamburgerprice;
    }
}
