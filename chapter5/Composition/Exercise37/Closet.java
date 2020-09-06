public class Closet {
    private int width;
    private int height;
    private int length;

    public Closet(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void storeClothes(String cloth) {
        System.out.println("You are storing a " + cloth + " in your closet.");
    }

    public void takeClothes(String cloth) {
        System.out.println("You are now taking " + cloth + " from your closet.");
    }

}
