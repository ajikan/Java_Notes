public class Main {
    public static void main(String[] args) {
        double val = 20.00;
        double val2 = 80.00;

        double val3 = (val + val2) * 100.00;

        val3 = val3 % 40.00;

        boolean isZero = val3 == 0d ? true : false;

        System.out.println(isZero);

        if (!isZero) System.out.println("Got some remainder");

        
    } 
}
