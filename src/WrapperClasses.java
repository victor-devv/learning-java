public class WrapperClasses {
    public static void main(String[] args) {
        //WRAPPER CLASSES
        // These provide a way to use primitive data types as reference data types. Primitive data types include boolean, char, int, double, bytes, shorts, floats, etc.

        // Reference data types e.g String have advantages and disadvantages. An advantage is that they contain useful methods and can be used with collections e.g ArrayList.
        //Disadvantage of reference data types is they're slow to access.

        //primitive     //wrapper
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double

        //Java has some features called autoboxing and unboxing which helps us to assign values to wrapper class automatically

        //AUTOBOXING => This is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

        //Assigning primitive data types to each corresponding wrapper class with AUTOBOXING
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Victor"; // Note that strings are already a reference data type

        //UNBOXING => This is the reverse of autoboxing. It is the automatic conversion of wrapper classes to primitive data types
        //below checking if true, a is acting primitive
        if(a == true) {
            System.out.println("This is true");
        }
    }
}
