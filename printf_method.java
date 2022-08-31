public class printf_method {
    public static void main(String[] args) {

        // printf() = an optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]

        System.out.printf("%d This is a format string\n",12345);
        
        boolean myboolean = true;
        char mychar = '$';
        String mystring = "Onii chan";
        int myint = 45;
        double mydouble = +1000;

        // Conversion Characters
        System.out.printf("%b \n", myboolean);
        System.out.printf("%c \n", mychar);
        System.out.printf("%s \n", mystring);
        System.out.printf("%d \n", myint);
        System.out.printf("%f \n", mydouble);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("This is a conversion character %20s\n", mystring);

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("you have this much money %.3f\n", mydouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus(+) or minus(-) sign for a numeric value
        // 0 : numeric values and zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %-20f\n", mydouble);
        System.out.printf("You have this much money %20f\n", mydouble);
        System.out.printf("You have this much money %020f\n", mydouble);
        System.out.printf("You have this much money %,f\n", mydouble);
        System.out.printf("You have this much money %+f\n", mydouble);
        
    }
}