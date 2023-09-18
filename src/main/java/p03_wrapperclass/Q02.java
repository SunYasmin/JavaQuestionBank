package p03_wrapperclass;

public class Q02 {

    /*
    Type a code to convert "103" String to byte and convert "2351" String to short
    then print the difference on the console.
     */
    public static void main(String[] args) {

        byte first = Byte.valueOf("103");
        short second = Short.valueOf("2351");
        System.out.println(second-first);

    }
}
