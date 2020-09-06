public class Room {
    private Desk desk;
    private Closet closet;
    private Bed bed;
    private Chair chair;

    public Room(Desk desk, Closet closet, Bed bed, Chair chair) {
        this.desk = desk;
        this.closet = closet;
        this.bed = bed;
        this.chair = chair;
    }
    
    public void rest(int hours) {
        getBed().sleep(hours);
    }

    public void study(int hours) {
        this.chair.sitOnChair(hours);
        this.desk.useDesk(hours);
    } 

    
    public Desk getDesk() {
        return this.desk;
    }

    public Closet getCloset() {
        return this.closet;
    }

    public Bed getBed() {
        return this.bed;
    }

    public Chair getChair() {
        return this.chair;
    }

}
