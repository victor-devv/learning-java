
public class Main {
    public static void main(String[] args) {
        //Anything declared as final cannot be updated or changed later in the program

        //Common practice is to make the name uppercase
        final double PI = 3.12159;

        //This won't work and the program won't compile
        //PI = 4;

        System.out.println(PI);
    }
}
