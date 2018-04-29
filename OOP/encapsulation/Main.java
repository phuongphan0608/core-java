package encapsulation;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial page count " + printer.getPagesPrinted());
        int pagePrinted = printer.printPages(11);
        System.out.println("Page printed was " + pagePrinted + ". New total print count for printer = " + printer.getPagesPrinted());

    }
}
