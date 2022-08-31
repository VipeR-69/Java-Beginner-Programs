public class methods {
    public static void main(String[] args) {

        // method - a block of code that is executed whenever it is called upon

        String name = "Chiyari";
        int age = 18;
        hello(name, age);

        int x = 10;
        int y = 20;
        int z = add(x,y);
        System.out.println(z);

        System.out.println(add(x,y));

    }

    static void hello(String name, int age) {
        System.out.println("Hello "+name+" You are "+age+" years old");
    }

    static int add(int a, int b) {
        return a+b;
    }

}