public class Overloaded {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozerella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozerella");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        Pizza pizza3 = new Pizza("thicc crust", "tomato");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);

        Pizza pizza4 = new Pizza("thicc crust");

        System.out.println("Here are the ingredients of your pizza : ");
        System.out.println(pizza4.bread);

    }
}