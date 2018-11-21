package TreeMaps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

    public static void main(String[] args) {

        TreeMap<String,String> tmap = new TreeMap<String, String>();
        tmap.put("Bulgaria","Sofia");
        tmap.put("Denmark","Copenhagen");
        tmap.put("Germany","Berlin");
        tmap.put("South Africa","Pretoria");


        Set set = tmap.entrySet();

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry mentry= (Map.Entry)itr.next();
            System.out.printf("The capital of %s is %s.%n", mentry.getKey(), mentry.getValue());
        }
    }
}
