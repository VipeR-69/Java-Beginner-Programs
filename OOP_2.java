public class OOP_2 {
    public static void main(String[] args) {
    
        Human human = new Human("Chiyari", 19, 60.4);
        Human human2 = new Human("Jadu", 19, 55.2);
        
        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();

        human.eat();
        human2.drink();
    
    }
}
