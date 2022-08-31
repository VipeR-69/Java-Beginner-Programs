import java.io.File;

public class File_Class {
    public static void main(String[] args) {

        // file - a abstract representation of file and directory pathnames

        File file = new File("Secret.txt");

        if(file.exists()) {
            System.out.println("That file exists! :D");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exists! :(");
        }
    }
}