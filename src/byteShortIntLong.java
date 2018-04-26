public class byteShortIntLong
{
    public static void main (String[] args){
    // int has a with of 32
    int myMinValue= -2147483648;
    int myMaxValue= 2_147_483_647;
    int myTotal = (myMinValue/2);
    System.out.println("My Total number is: " + myTotal);

    // byte has a width of 8
    byte myByteValue = -128;
    byte myNewByteValue = (byte) (myByteValue/2);
    System.out.println("My New Byte Value number is: " + myNewByteValue);

    //short has a width of 16
    short myShortValue = 32767;
    short myNewShortValue = (short)(myShortValue/2);
    System.out.println("My my New Short Value number is: " + myNewByteValue);

    //long has a width of 64
    long myLongValue = 100L;
    long myLongValue1 = 9_223_372_036_854_775_807L;
    }
}
