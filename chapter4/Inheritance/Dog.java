// Inherits all public methods and fields from Animal including constructor.
public class Dog extends Animal {
        private int eyes;
        private int tail;
        private int legs;
        private int teeth;
        private String coat;

    // When extending another class, need to call constructor of that class
    public Dog(String name, int size, int weight, int eyes, int tail, int legs, int teeth, String coat) {
        // Calls constructor of Animal
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walk called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog run called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog moveLegs called");
    }
    
    @Override
    public void move(int speed) {
        System.out.println("Dog move called");
        moveLegs(speed);
        super.move(speed);
    }




}
