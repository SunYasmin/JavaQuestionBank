package p02_typeCasting;

public class Q04 {
    /*
    Create a double variable and convert it to a short variable, then print the value of the short variable on the console.
    Be careful about  the output, it will not be a decimal value.

     */
    public static void main(String[] args) {

        double price = 1.2;
        short newPrice = (short)price;
        System.out.println(newPrice); // Veri kaybi output = 1 not decimal value
    }
}
