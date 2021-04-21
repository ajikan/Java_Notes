
class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private String model;

    public Car(int cylinders, int doors, String model) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.model = model;
    }

    public void startEngine() {
        if (engine) {
            System.out.println("Starting the engine");
        }
        else {
            System.out.println("Your car does not have an engine");
        }
    }

    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    public void brake() {
        System.out.println("Braking the car");
    }

    public String getModel() {
        return this.model;
    }
}


class Ford extends Car {
    
    public Ford() {
        super(4, 4, "Ford");
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " is now starting the engine");
    }
    
    @Override
    public void accelerate() {
        System.out.println(getModel() + " is now accelerating the car");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is now braking the car");
    }

}

class Chevrolet extends Car {
    
    public Chevrolet() {
        super(4, 4, "Chevrolet");
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " is now starting the engine");
    }
    
    @Override
    public void accelerate() {
        System.out.println(getModel() + " is now accelerating the car");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is now braking the car");
    }
}

class Toyota extends Car {
    
    public Toyota() {
        super(4, 4, "Toyota");
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " is now starting the engine");
    }
    
    @Override
    public void accelerate() {
        System.out.println(getModel() + " is now accelerating the car");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is now braking the car");
    }
}

class FailCar extends Car {
    
    public FailCar() {
        super(4, 4, "Failure");
    }

}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Toyota();
        Car car2 = new Ford();
        Car car3 = new Chevrolet();
        Car car4 = new FailCar();
        

        car1.startEngine();
        car2.startEngine();
        car3.startEngine();
        car4.startEngine();
        
        car1.accelerate();
        car2.accelerate();
        car3.accelerate();
        car4.accelerate();

        car1.brake();
        car2.brake();
        car3.brake();
        car4.brake();

    }
}
