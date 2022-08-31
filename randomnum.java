import java.util.Random;

public class randomnum {
    
    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt(1,7);
        System.out.println(x);

        double y = random.nextDouble(1,3);
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
