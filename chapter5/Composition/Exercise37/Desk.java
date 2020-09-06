public class Desk {
    private int width;
    private int height;
    private int length;

    public Desk(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void useDesk(int hours) {
        System.out.println("You are now using your desk for " + hours + " hours.");
    }

}
