public class friend {
    
    String name;
    static int numberoffriends;

    friend(String name) {
        this.name = name;
        numberoffriends++ ;
    }

    static void display() {
        System.out.println("You have "+numberoffriends+" friends");
    }
}
