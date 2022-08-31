import java.util.ArrayList;

public class foreach_loop {
    public static void main(String[] args) {

        // for-each - traversing technique to iterate through the elements in an array/collection
        //            less steps, more readable
        //            less flexible

        //String[] animals = {"cat", "dog", "bird", "wolf"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("wolf");

        for(String i : animals) {
            System.out.println(i);
        }


    }
}
