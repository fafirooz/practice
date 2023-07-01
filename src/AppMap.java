import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AppMap {
    public static void main(String[] args) {
        Map < Integer , String > firstMap = new HashMap<>();
        firstMap.put(1, "Hello");
        firstMap.put(2 , "Fariba");
        firstMap.put(3 , "Hello");
        System.out.println(firstMap);

        Map < String , Integer> secMap = new HashMap<>();
        secMap.put("Fariba", 2);
        secMap.put("Java", 0);
        secMap.put("FaribaFirooz", 5);
        System.out.println(secMap);
        for (Map.Entry<String, Integer> element : secMap.entrySet()){ // another to print
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }


        Map < Integer, Integer> thirdMap = new LinkedHashMap<>(); // because unique key and value have same type.
        thirdMap.put(1, 3);
        thirdMap.put(2,4);
        for (Map.Entry<Integer, Integer> element1 : thirdMap.entrySet()){ // another to print
            System.out.println(element1.getKey());
            System.out.println(element1.getValue());
        }

    }



}
