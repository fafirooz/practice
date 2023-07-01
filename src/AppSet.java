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

        Set<Integer> union= new HashSet<>(set01);
        union.addAll(set02);
        //union.retainAll(set02);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set01);
        intersection.retainAll(set02);
        System.out.println(intersection);

        Set <Integer> difference= new HashSet<>(set01);
        difference.removeAll(set02);
        System.out.println(difference);




        List<Integer> list01 =  new ArrayList<>();
        list01.add(6);
        list01.add(7);
        list01.add(8);
        List<Integer> list02 =  new ArrayList<>();
        list02.add(7);
        list02.add(8);
        list02.add(9);

        List <Integer> unionlist= new ArrayList<>(list01);
        unionlist.addAll(list02);
        System.out.println(unionlist);
        List <Integer> intersectionList = new ArrayList<>(list01);
        intersectionList.retainAll(list02);
        System.out.println(intersectionList);

    }



}
