package LinkedHashMap;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map <String,String> lhmap = new LinkedHashMap<String, String>();

        lhmap.put("Bulgaria","Sofia");
        lhmap.put("South Africa","Pretoria");
        lhmap.put("Denmark","Copenhagen");
        lhmap.put("Germany","Berlin");

        Set set =lhmap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry mapEntry = (Map.Entry)itr.next();
            System.out.printf("The capital of %s is %s.%n",mapEntry.getKey(),mapEntry.getValue()); //keeps the insertion order
        }
    }
}
