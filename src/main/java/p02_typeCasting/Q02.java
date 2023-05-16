package p02_typeCasting;

public class Q02 {
    /*
    Create a long variable and convert it to an int variable.
     */
    public static void main(String[] args) {

        long age = 12L;
        int newAge = (int)age;   //Expilicit narrowing otomatik yapilamaz.
        System.out.println(newAge);
    }
}
