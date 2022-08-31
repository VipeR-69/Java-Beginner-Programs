public class Array_2D {
    public static void main(String[] args){
        
        // 2D Array - an array of arrays

        String[][] cars = { 
                            {"McLaren", "Lotus", "Audi"},
                            {"Mercedes", "Mustang", "BMW"},
                            {"Tesla", "Ferrari", "Lambo"}
                          };

        for(int i=0; i<=cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }

    }
}
