package Variables;

public class Q03 {
    //Type a code to find simple interest,
    //Note: Simple interest formula = principal * rate* numberOfYear / 100
    public static void main(String[] args) {

        int principal = 10000, rate = 6, numberOfYear = 3;  //Ayni data type'da birden fazla variable tek satirda olusturulurken data type 1 kez en basa yazilir.
        int simpleInterest = principal * rate * numberOfYear;
        System.out.println("The simple interest is " + simpleInterest);

    }
}
