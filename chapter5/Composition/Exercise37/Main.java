public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk(20, 10, 10);
        Bed bed = new Bed(20, 10, "King");
        Closet closet = new Closet(10, 20, 10);
        Chair chair = new Chair(5, 5, 5, "wooden");
        Room room = new Room(desk, closet, bed, chair);

        room.rest(3);
        room.study(3);

        
    }
}
