package composition;

public class Main {

    public static void main(String[] args) {


        Case theCase = new Case("2208", "Dell", "240", new Dimentions(20, 20, 5));

        Monitor monitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 4, "v2.44");

        PC pc = new PC(monitor, theCase, motherBoard);

//        pc.getMonitor().drawPixetAt(1500, 1200, "red");
//
//        pc.getMotherBoard().loadProgram("Windows 7");
//
//        pc.getTheCase().pressPowerButton();


        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.




    }
}
