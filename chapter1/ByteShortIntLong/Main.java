public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue); 
        System.out.println("Byte Maximum Value = " + myMaxByteValue); 

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue); 
        System.out.println("Short Maximum Value = " + myMaxShortValue); 

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue); 
        System.out.println("Long Maximum Value = " + myMaxLongValue); 
        
        // By default, Java treats whole number literals as int
        // Add L at the end to specify Long
        
        long bigLongLiteralValue = 2_147_483_647_234L; // Have to add L or results in error because number goes above int max value 
        System.out.println(bigLongLiteralValue);
    
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); // Have to cast or else default is int which can't fit in Byte
        short myNewShortValue = (short) (myMinShortValue / 2);

        
        byte challengeByte = 100;
        short challengeShort = 20000;
        int challengeInt = 200000;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        System.out.println(challengeLong);


    }        
    
}
