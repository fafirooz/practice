import java.util.Objects;

public class LaptopPoly extends ComputerPoly{
    private int ID= 5;







    @Override
    public void start() {
        System.out.println("Laptop starts:");
    }

    @Override
    public void info() {
        System.out.println("Laptop ID is:" + ID);

    }

    public < E > void genericMethod(E [] inputArray) {
        for( E element: inputArray){
            System.out.println("This is the element" +" "+ element);

        }
    }

}
