package p02_typeCasting;

public class Q05 {
    /*
    Cretae a byte variable and convert it to a double variable, then print the value of the double variable on the console.
    Be careful about the output, it will be decimal number.
     */
    public static void main(String[] args) {

        byte age = 23;
        double newAge = age;
        System.out.println(newAge);  //output 23.0  decimal number
    }
}
