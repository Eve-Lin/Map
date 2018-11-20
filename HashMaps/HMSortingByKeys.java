package HashMaps;

import java.util.*;

public class HMSortingByKeys {

    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<String, String>();


        hmap.put("Merry", "Sofia");
        hmap.put("Eve", "Sofia");
        hmap.put("Kate", "Copenhagen");
        hmap.put("Tobias", "Aarhus");
        hmap.put("Veronika", "Berlin");


        System.out.println("Before sorting:");

        Set set = hmap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        Map<String, String>map = new TreeMap<String, String>(hmap);
        System.out.println();
        System.out.println("After sorting:");
        Set set2 = map.entrySet();
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()){
            Map.Entry me2 = (Map.Entry)iterator.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}
