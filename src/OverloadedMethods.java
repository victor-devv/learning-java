public class OverloadedMethods {
    public static void main(String[] args) {
        //OVERLOADED METHODS
        //These are methods that share the same name but have different parameters.
        //This is allowed because each method is allowed to have its own unique method signature i.e method name  + parameters
        //The number of parameters, data type and arrangement are factored in

        double x = add(1.0, 2.0, 3.0, 4.0);
        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }

}
