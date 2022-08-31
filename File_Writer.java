import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("Secret.txt");
            writer.write("Chiyari Nashedi Hai \n saste nashe krta hai \n ganjedi sala..");
            writer.append("\nSuper Secret");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
