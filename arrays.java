public class arrays {
    public static void main(String[] args){

        // array - used to store multiple values in a single variable

        String[] cars = {"Mercedes", "Tesla", "Audi", "BMW"};

        cars[0] = "Mustang";
        System.out.println(cars[0]);

        System.out.println(cars[3]);

///////////////////////////////////////////////////////////////////////////////////////////////////////

        String[] bikes = new String[3];

        bikes[0] = "Bullet";
        bikes[1] = "Harley";
        bikes[2] = "Ducati";

        System.out.println(bikes[2]);

///////////////////////////////////////////////////////////////////////////////////////////////////////

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
