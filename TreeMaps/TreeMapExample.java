package TreeMaps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();


        tmap.put(7, "Running");
        tmap.put(3, "Skiing");
        tmap.put(1, "Swimming");
        tmap.put(5, "Gymnastics");

        Set set = tmap.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){

            Map.Entry mentry = (Map.Entry)itr.next();
            System.out.printf("Key is: %d & value is: %s%n",mentry.getKey(),mentry.getValue());
        }
    }
}
