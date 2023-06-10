package p03_wrapperclass;

public class Q01 {

    //Type a code to find the sum of the minimum value of the byte and the maximum value of short data types

    public static void main(String[] args) {

        byte min = Byte.MIN_VALUE;
        System.out.println(min);
        short max = Short.MAX_VALUE;
        System.out.println(max);
        System.out.println(min + max);
    }
}
