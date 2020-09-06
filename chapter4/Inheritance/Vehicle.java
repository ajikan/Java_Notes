public class Vehicle {
    private String name;
    private String size;

    private int speed;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees.");
    }

    public void move(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.speed + " in direction " + this.direction);
    }

    public void stop() {
        this.speed = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
