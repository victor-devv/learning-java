import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        //FOR EACH LOOP => This is also known as advanced for loop. It is a traversing technique to iterate through elements in an array/collection. It takes less steps and is more readable than a for loop. However it is less flexible than a for loop.

//        String[] animals = {"cat", "dog", "rat", "bird"};
//
//        //foreach animal in animals
//        for (String animal : animals ) {
//            System.out.println(animal);
//        }

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String animal : animals ) {
            System.out.println(animal);
        }
    }
}
