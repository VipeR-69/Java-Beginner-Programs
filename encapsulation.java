public class encapsulation {
    public static void main(String[] args){

        //Encapsulation - attributes of a class will be hidden or private,
        //                Can be accessed only through methods (getters & setters)
        //                You should make attributes private if you don't have a reason to make them public/protected

        play bag = new play("OP","Bhai",23);
        
        bag.setyear(2022);
        System.out.println(bag.getmake());

        System.out.println(bag.getmodel());

        System.out.println(bag.getyear());
    }
}
