public class Arrays {
    public static void main(String[] args) {
//        //Method 1
//        String[] cars = {"Camaro", "Tesla", "Corvette"};
//
//        //Reassign index. To add values to array, it must be o the same data type
//        cars[0] = "Mustang";
//
//        System.out.println(cars[0]);

        //Method 2
        String[] cars = new String[3]; //3 means number of assignable elements

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Mustang";
        //System.out.println(cars[0]);

        //Iterate through array elements
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
