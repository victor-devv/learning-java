import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args)
    {
        //Using Scanner class to accept user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //clear \n from scanner since nextInt doesn't take the \n from the enter key. Not doing this would prevent the next nextLine() input from allowing user inputs
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You like "+food);



    }
}
