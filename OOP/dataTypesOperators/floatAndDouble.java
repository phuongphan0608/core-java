package dataTypesOperators;

public class floatAndDouble {

    public static void main(String[] args){

        // width of int = 32  (4 bytes)
        int myIntValue = 5;
        // width of float = 32  (4 bytes)
        float myFloatValue = 5f / 2f;

        float myFloatCastValue = (float) 5.4;
        // width of double = 64  (8 bytes)
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Float has 7 numbers after .
        float myFloatValue1 = 5f / 3f;

        // Float has 16 numbers after .
        double myDoubleValue1 = 5d / 3d;
        System.out.println("myFloatValue1 = " + myFloatValue1);
        System.out.println("myFloatValue1 = " + myDoubleValue1);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double onePound = 0.45359237;

        double weightkIlo = 5d;
        double convertedPound = (weightkIlo/onePound);
        double weightPound = 11;
        double convertedKilo = (weightPound*onePound);
        System.out.println("Weigh in pound is:" + convertedPound);
        System.out.println("Weigh in kilo is:" + convertedKilo);


    }

}
