public class Methods {
    public static void main(String[] args) {
        //call method
//        hello();

        //name is an argument
//        String name = "Victor";
//        helloWithName(name);
//
//        int age = 21;
//        helloWithParams(name, age);

        int x = 3;
        int y = 4;

        System.out.println(add(x, y));
    }

    //METHODS => A block of code that is executed whenever it is called upon.
    //Common convention for methods is that the first letter of the name should be lower case

    static void hello() {
        System.out.println("Hello");
    }

    //name is a parameter
    static void helloWithName(String name) {
        System.out.println("Hello " + name);
    }

    static void helloWithParams(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    //Return types
    static int add(int x, int y) {
        return x + y;
    }
}
