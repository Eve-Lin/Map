package TreeMaps;

import java.util.*;

public class TreeMapReverseOrder {

    public static void main(String[] args) {
        Map<String,String> capitals = new TreeMap<String, String>(Collections.reverseOrder());
        capitals.put("Bulgaria","Sofia");
        capitals.put("South Africa","Pretoria");
        capitals.put("Denmark","Copenhagen");
        capitals.put("Germany","Berlin");

        Set set = capitals.entrySet();
        Iterator itr = set.iterator();
        System.out.println();
        while (itr.hasNext()){
            Map.Entry mapEntry = (Map.Entry)itr.next();
            System.out.printf("The capital of %s is %s.%n", mapEntry.getKey(), mapEntry.getValue());


        }
    }
}
