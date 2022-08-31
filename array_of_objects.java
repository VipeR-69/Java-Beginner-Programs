public class array_of_objects {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        food_objects food1 = new food_objects("Pizza");
        food_objects food2 = new food_objects("Hamburger");
        food_objects food3 = new food_objects("Hotdog");

        food_objects[] refridgerator = {food1, food2, food3};

        System.out.println(refridgerator[0].name);
        System.out.println(refridgerator[1].name);
        System.out.println(refridgerator[2].name);

    }
}
