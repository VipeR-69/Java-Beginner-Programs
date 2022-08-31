public class OOP {
    public static void main(String[] args) {

        Car mycar = new Car();
        Car mycar2 = new Car();

        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.color);
        System.out.println(mycar.year);

        mycar.drive();
        mycar.brake();

        System.out.println(mycar2.make);
        System.out.println(mycar2.model);
        System.out.println(mycar2.year);
        System.out.println(mycar2.color);

    }
}
