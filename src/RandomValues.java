//Generate Random Values
import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        //Random integer
        //int x = random.nextInt(6);
        //double x = random.nextDouble(); //numbers between 0 and 1
        boolean x = random.nextBoolean();
        System.out.println(x);
    }
}
