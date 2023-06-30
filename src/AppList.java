import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AppList {
    public static void main(String[] args) {
        String [] arrStr= {"Hi", "Java"}; // array cant call remove or add or get!!
        System.out.println(arrStr[1]); // array is static and fix size, but arraylist is dynamic and has a variable size.

        Integer [] arrInt = { 1,2,3,4};
        String [] arrStr1 = {"welcome", "Java"};
        LaptopPoly laptopPoly01 = new LaptopPoly();
        laptopPoly01.genericMethod(arrStr1);
        laptopPoly01.genericMethod(arrInt);

        List < String> arrList = new ArrayList <>();
        arrList.add("Hello");
        arrList.add("Fariba");
        //arrList.remove(1);
        System.out.println(arrList);

        //List < String> arrList2 = Arrays.asList("fd","Fe");

        List < String> arrList01 = new LinkedList<>();
        arrList01.add("Learn");
        arrList01.add("Java");


        for ( String element : arrList01){
            System.out.println(element);
        }


    }
}
