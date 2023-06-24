import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" You need to type your name");
        String name = scanner.nextLine();
        System.out.println("Name is: " + name);

        System.out.println(" You need to type your age");
        Integer age= scanner.nextInt();
        System.out.println("Your age is:" + age);
        System.out.println(name + " is" + " " + age);


    }
}
