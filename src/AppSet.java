import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppSet {
    public static void main(String[] args) {

        Set<Integer> set01 =  new HashSet<>();
        set01.add(1);
        set01.add(2);
        set01.add(3);
        Set<Integer> set02 =  new HashSet<>();
        set02.add(3);
        set02.add(4);
        set02.add(5);

        Set<Integer> set03= new HashSet<>(set01);
        set03.addAll(set02);
        System.out.println(set03);


        List<Integer> list01 =  new ArrayList<>();
        list01.add(6);
        list01.add(7);
        list01.add(8);
        List<Integer> list02 =  new ArrayList<>();
        list02.add(7);
        list02.add(8);
        list02.add(9);

        List <Integer> list03= new ArrayList<>(list01);
        list03.addAll(list02);
        System.out.println(list03);

    }



}
