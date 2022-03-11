public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //Multidimensional Arrays / 2D Arrays
        // A 2d array is an array of arrays
//        String[][] cars = new String[3][3];
//
//        //row 0 column 0
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Porsche";
//
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Chevrolet";
//        cars[1][2] = "Volvo";
//
//        cars[2][0] = "Bugatti";
//        cars[2][1] = "Lexus";
//        cars[2][2] = "Maserati";

        //Method 2
        String[][] cars = {
                {"Camaro", "Corvette", "Porsche"},
                {"Mustang", "Chevrolet", "Volvo"},
                {"Bugatti", "Lexus", "Maserati"}
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();//move cursor to next row

            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+ " ");
            }
        }

    }
}
