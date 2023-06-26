import java.util.ArrayList;
import java.util.List;

public class AppGenerics {

    public static void main(String[] args) {
        //String[] arrStr = {"Hello", "World"};
        //LaptopPoly laptopPoly= new LaptopPoly();
        //laptopPoly.genericMethod(arrStr);
        List <String> list0= new ArrayList<>();
        list0.add("hello");
        list0.add("hi");
        list0.remove(0);
        System.out.println(list0);
    }
}
