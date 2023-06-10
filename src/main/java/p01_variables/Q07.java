package p01_variables;

import java.util.Scanner;

public class Q07 {
    /*
    Type a code to swap two integers.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping: " +n1 + "-" + n2);

        //Way 1: Use third variable;
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping: " + n1 + "-" + n2);

        //Way 2: Don't use 3rd variable
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("After swapping: " + n1 + "-" + n2);


    }
}
