public class method_overriding {
    public static void main(String[] args) {

        // method overwritting - Declaring a method in sub class,
        //                       which is already present in parent class.
        //                       done so that a child class can give its own implementation.

        Dog dog = new Dog();
        Animal animal = new Animal();

        animal.speak();
        dog.speak();

    }
}
