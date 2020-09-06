public class Chair {
    private int length;
    private int height;
    private int width;
    private String type;

    public Chair(int length, int height, int width, String type) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public void sitOnChair(int hours) {
        System.out.println("You are now sitting on chair for " + hours + " hours.");
    } 



}
