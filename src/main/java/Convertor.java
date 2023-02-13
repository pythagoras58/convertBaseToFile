import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Convertor {

    public static void main(String[] args) {
        File file = new File("./test.pdf");

        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){

           Path fileName = Path.of("C:\\Users\\solomonda\\Documents\\workspace\\udacity\\convertBaseToFile\\src\\main\\java\\base.txt");

           String base = Files.readString(fileName);

            byte[] d = Base64.getDecoder().decode(base);

            fileOutputStream.write(d);
            System.out.println("Success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
