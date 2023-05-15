package Variables;

public class Q04 {
    /**Create a String and two Long variables.
    Print the sum and the multiplication of the long variables with the String on the console
    */
    public static void main(String[] args) {

        String s = "The result is ";
        Long a = 123L;
        Long b = 9123456782L;
        System.out.println(s + (a+b)); //String ile toplama islemi concatination olarak karsilik bulur. Sayilar parantezde oldugu icin islem onceligi devreye girer.
        System.out.println(s + (a*b));


    }
}
