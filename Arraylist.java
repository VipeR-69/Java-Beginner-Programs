import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        // ArrayList - a resizable array.
        //             Elements can be added and removed after compilation phase.
        //             store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Hotdog");

        food.set(0, "Patiz");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

//////////////////////////////////////////////////////////////////////////////////////////////////

        // 2D ArrayList - a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<String> BakeryList = new ArrayList();
        BakeryList.add("Pasta");
        BakeryList.add("Garlic Bread");
        BakeryList.add("Donuts");
        
        ArrayList<String> ProductList = new ArrayList();
        ProductList.add("Tomatoes");
        ProductList.add("Pepper");
        ProductList.add("Salt");

        ArrayList<String> DrinksList = new ArrayList();
        DrinksList.add("Coke");
        DrinksList.add("Pepsi");
        DrinksList.add("Sting");
        
        ArrayList<ArrayList<String>> GroceryList = new ArrayList();
        GroceryList.add(BakeryList);
        GroceryList.add(ProductList);
        GroceryList.add(DrinksList);

        System.out.println(GroceryList);
        System.out.println(GroceryList.get(0));
        System.out.println(GroceryList.get(0).get(1));
        System.out.println(GroceryList.get(2).get(2));


    }
}