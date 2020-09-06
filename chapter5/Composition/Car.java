public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    // Car is-a Vehicle
    // Inheritance: is-a relationship
    public Car(String name, int doors, int enginCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}
