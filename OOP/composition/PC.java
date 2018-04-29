package composition;

public class PC {

    private Monitor monitor;
    private Case theCase;
    private MotherBoard motherBoard;

    public PC(Monitor monitor, Case theCase, MotherBoard motherBoard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Fancy graphics
        monitor.drawPixetAt(500,200,"red");
    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Case getTheCase() {
//        return theCase;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
