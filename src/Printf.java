public class Printf {
    public static void main(String[] args) {
        //printf()
        //This is an optional method to control, format and display text to the console window.
        //It requires two arguments => format string + (object/variable/value).
        // % [flags] [precision] [width] [conversion-character]

        //FORMAT SPECIFIER is %

        //[CONVERSION-CHARACTER] is a letter that comes after format specifier
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Victor";
        int myInt = 100;
        double myDouble = 1000.0;
        double neg = -100;
        double pos = +100;

        //%b = boolean
//        System.out.printf("%b", myBoolean);

        //%c = char
//        System.out.printf("%c", myChar);

        //%s = String
//        System.out.printf("%s", myString);

        //%d = decimal value
//        System.out.printf("%d", myInt);

        //%f = floats and doubles
//        System.out.printf("%f", myDouble);

        //[WIDTH] => This sets the minimum number of characters to be written as output
//        System.out.printf("Hello %10s", myString);

        //[PRECISION] => This sets the number of digits of precision when outputting floating point values. That is, it converts the float to a specified number o decimal places.
//        System.out.printf("You have this much money %.2f", myDouble);

        //[FLAGS] => This adds an effect to the output. It is added to the specifier
        // - : left-justify
//        System.out.printf("You have this much money %-20f", myDouble);

        // + : output a plus (+) or minus (-) sign for a numeric value
//        System.out.printf("You have this much money %+f", neg);
//        System.out.printf("You have this much money %+f", pos);

        // 0 : numeric values are zero-padded
//        System.out.printf("You have this much money %020f", myDouble);

        // , : comma grouping separator if numbers >= 1000
        System.out.printf("You have this much money %,f", myDouble);
    }

}
