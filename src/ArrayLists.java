import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //ARRAY LIST => This is a resizable array. Elements can be removed after the compilation phase. They only store reference data types.
        //Note that to store primitive data types, you need to use their wrapper classes i.e Integer not int, etc.

        //Array List is a type of collection

        ArrayList<String> food = new ArrayList<String>();

        food.add("Rice");
        food.add("Chicken");
        food.add("Pasta");

        //ARRAYLIST METHODS
        //set => set a value at a certain index
        food.set(0, "Amala");

        //remove => remove value at a certain index
        food.remove(1);

        //clear => clear arraylist
        food.clear();

        //Note that for ArrayList, you get the size using .size() not .length
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
