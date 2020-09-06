public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 1, 4, 20, "long silky");
        Fish fish = new Fish("Shark", 50, 100, 2, 2, 2);

        dog.eat();

        dog.run();
        dog.walk();

        fish.swim(10);

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);

    }
}
