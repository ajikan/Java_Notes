public class Outlander extends Car{
    private int roadServiceMonths;    

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newSpeed = getSpeed() + rate; // getSpeed inherited from Vehicle
        if (newSpeed <= 0) {
            stop(); // inherited from Vehicle 
            changeGear(1);
        }
        else if (newSpeed <= 10) {
            changeGear(1);
        }
        else if (newSpeed <= 20) {
            changeGear(2);
        }
        else if (newSpeed <= 30) {
            changeGear(3);
        }
        else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeVelocity(newSpeed, getDirection()); 
        }
    }
}
