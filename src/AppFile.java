import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppFile {
    public static void main(String[] args) throws IOException {
        // how can we read a file here:
        File file = new File("text");
        Scanner scanner = new Scanner(file);
        // how can we write in a file :
       /* FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("some text");
        fileWriter.flush();
        fileWriter.close();*/

        //how can we through the contents? one is while
        while (scanner.hasNext()){ // hasNext: allow us to detect to if we have some contents to display or not
            System.out.print(scanner.next());// scanner is not a string, .next makes it to a string.
        }



    }
}