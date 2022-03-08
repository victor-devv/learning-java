import java.util.Scanner;

public class DoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        //do loop will do a block of code at least once then check the condition
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Hello " + name);
    }
}
