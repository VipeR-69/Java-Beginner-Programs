public class copy_objects {
    public static void main(String[] args){

        play bag1 = new play("Audi", "A5", 2021);
        //play bag2 = new play("Mercedes", "Concept", 2021);

        //bag2.copy(bag1);

        play bag2 = new play(bag1);

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println();
        System.out.println(bag1.getmake());
        System.out.println(bag1.getmodel());
        System.out.println(bag1.getyear());
        System.out.println();
        System.out.println(bag2.getmake());
        System.out.println(bag2.getmodel());
        System.out.println(bag2.getyear());
    
    }
}
