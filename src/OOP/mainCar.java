package OOP;

public class mainCar {

    public static void main(String[] args) {
        CarPrivateFieldsPublicSetGetMethods porsche = new CarPrivateFieldsPublicSetGetMethods();
        CarPrivateFieldsPublicSetGetMethods holden = new CarPrivateFieldsPublicSetGetMethods();
        porsche.setModel("123");
        System.out.println("Model is " + porsche.getModel());
    }
}
