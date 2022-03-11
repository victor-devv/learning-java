public class StringMethods {
    public static void main(String[] args) {
        String name = "Victor";

        //Equals => compare two strings to see if equal. Returns bool
//        boolean result = name.equals("Victor");
//
//        System.out.println(result);

        //Equalsignorecase => like equals but not case sensitive

//        boolean result = name.equalsIgnoreCase("victor");
//
//        System.out.println(result);

        //Length => returns the length of a string (int)
        //int result = name.length();

        //System.out.println(result);

        //charAt => returns a single character at an index
//        char result = name.charAt(0);
//
//        System.out.println(result);

        //indexOf => returns the index of a char in a string
//        int result = name.indexOf("i");
//
//        System.out.println(result);

        //isEmpty
//        boolean result = name.isEmpty();
//
//        System.out.println(result);

        //toUpperCase => change all letters to uppercase
//        String result = name.toUpperCase();
//
//        System.out.println(result);

        //toLowerCase
//        String result = name.toLowerCase();
//
//        System.out.println(result);

        //trim => remove whitespaces
//        String result = name.trim();
//
//        System.out.println(result);

        //replace a character with another in a string
        String result = name.replace('o', 'a');

        System.out.println(result);
    }
}
