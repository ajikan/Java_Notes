public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        float myFloatValue = 5f / 3f; // Default floating point number literal is double so need to cast or add f at end.
        double myDoubleValue = 5d / 3d;
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        
        int numPounds = 200;
        double numKilograms = numPounds * 0.45359237d;
        System.out.println(numKilograms);

        
    }
}
