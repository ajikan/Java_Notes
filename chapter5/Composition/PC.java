public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        this.theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        this.monitor.drawPixelAt(1500, 1200, "yellow"); 
    }

    private Case getTheCase() {
        return this.theCase;
    }

    private Monitor getMonitor() {
        return this.monitor;
    }

    private Motherboard getMotherboard() {
        return this.motherboard;
    }




}
