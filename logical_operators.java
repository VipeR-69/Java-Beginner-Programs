import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args){

        // logical operator = used to connect two or more expressions
        //
        //                    && = (AND) both conditions must be true
        //                    || = (OR) either condition must be true
        //                    !  = (NOT) reverses boolean value of condition

        int temp=30;

        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("It is Pleasent Weather");
        }
        else{
            System.out.println("It is cold outside");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit.. ");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game");
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Choose b/w Fruits, Vegetables Or Plants");
        String response2 = scanner2.next();

        if(!response2.equals("Fruits") && !response2.equals("Vegetables")) {
            System.out.println("You choose Plants");
        }
        else if(!response2.equals("Plants") && !response2.equals("Vegetables")) {
            System.out.println("You choose Fruits");
        }
        else if(!response2.equals("Fruits") && !response2.equals("Plants")) {
            System.out.println("You choose Vegetables");
        }

        scanner.close();
        scanner2.close();
    
    }

}