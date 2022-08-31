public class overloaded_methods {
    public static void main(String[] args) {

        // Overloaded methods - methods that share the same name but have different parameters
        //                      method name + parameters = method signature

        int x = add(2,4);
        System.out.println(x);

        int z = add(2,4,6,6);
        System.out.println(z);

        double y = add(2.6, 5.3, 7.1);
        System.out.println(y);

        double a = add(2.8, 4.8, 9.2, 8.2);
        System.out.println(a);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method 1 .");
        return a+b;
    }
    
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method 2 .");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method 3 .");
        return a+b+c+d;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded method 4 .");
        return a+b;
    }
    
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method 5 .");
        return a+b+c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method 6 .");
        return a+b+c+d;
    }

}