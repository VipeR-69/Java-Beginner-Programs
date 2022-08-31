import java.util.Scanner;

public class math {
    
    public static void main(String[] args){

        double x = 3.14;
        double y = 10;

        double z = Math.min(x,y);
        System.out.println(z);

        double a = Math.max(x,y);
        System.out.println(a);

        double b = Math.abs(y);
        System.out.println(b);

        double c = Math.sqrt(y);
        System.out.println(c);

        double d = Math.round(x);
        System.out.println(d);

        double e = Math.ceil(x);
        System.out.println(e);

        double perpendicular;
        double base;
        double hypotaneous;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter perpendicular - ");
        perpendicular = scanner.nextDouble();
        System.out.println("Enter base - ");
        base = scanner.nextDouble();

        hypotaneous = Math.sqrt((perpendicular * perpendicular)+(base * base));

        System.out.println("Hypotaneous is - "+hypotaneous);

        scanner.close();
    }
}
