import java.io.File;
import java.io.FileReader;

public class AppException {
    public static void main(String[] args) {
        // check exception
       /* File file = new File("something");
        FileReader fileReader = new FileReader(file); */
        // this is a compiler exception
        // the compiler doesn't know that, it is suspicious and it will highlight it



        // runtime exception: it occurs only at runtime
        Integer [] arrInt = {1,2,3};
        System.out.println("Before exception"); //doesn't type, the thread jump to the try and catch.

        try {
            System.out.println(arrInt[3]);// the execution stop here then jump to the catch.
            System.out.println("doesn't type");
        } catch (Exception e) { //this is a general exception that catch different exception.
            System.out.println("After exception");
        }
        System.out.println("Jump the exception"); //the program doesn't stop in exception line.



    }
}
