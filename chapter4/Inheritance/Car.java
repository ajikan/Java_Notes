public class Car extends Vehicle {
    private int gears;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGear;


    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    } 

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Veocity = " + speed + " direction " + direction);
        super.move(speed, direction);
    }

}
