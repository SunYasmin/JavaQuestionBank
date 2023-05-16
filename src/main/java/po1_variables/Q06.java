package po1_variables;

public class Q06 {
    /*
    Create 3 float variables for the price of a book , notebook and laptop.
    Print the total price of 2 books , 4 notebooks and 3 laptops on the console.
     */

    public static void main(String[] args) {

        float book = 12.99F , noteBook = 23.45F , laptop = 34.12F;
        float totalPrice = 2*book + 4*noteBook + 3*laptop;
        System.out.println("Total price is = " + totalPrice);
    }
}
