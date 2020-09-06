public class Bed {
    private int width;
    private int length;
    private String type;
    
    public Bed(int width, int length, String type) {
        this.width = width;
        this.length = length;
        this.type = type;
    }

    public void sleep(int hours) {
        System.out.println("Your are now sleepign for " + hours + " hours.");
    }
}
