package controlFlows;

public class whileDoWhile {

    public static void main(String[] args) {
//        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100) {
//                break;
//            }
//
//        } while(count != 6);

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }



       //List out even numbers in the range {0,100}
//        int count =0;
//        while (count < 100){
//            if (isEvenNumber(count))
//            {
//                System.out.println(count + " is an even number.");
//            }
//            count++;
//
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int lastNumber = 20;
        int count = 0;
        while ((number <lastNumber) && (count <5)){
            number ++;
            if (!isEvenNumber(number)){
               continue;
            }
            count++;
            System.out.println("Even number is "+ number);
        }
        System.out.println("Total even number found is" + count);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
    public static boolean isEvenNumber (int n){
        if (n % 2 == 0)
        {
            return true;
        } else {
            return false;
        }

    }

}
