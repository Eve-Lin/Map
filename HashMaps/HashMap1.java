package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    public static void main(String[] args) {


        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "Sofia");
        hmap.put(2, "Copenhagen");
        hmap.put(3, "Århus");
        hmap.put(4, "Düsseldorf");
        hmap.put(5, "Johannesburg");

        Set set = hmap.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry mentry = (Map.Entry) itr.next();
            System.out.print("Key is:" + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());

        }

            String myVar = hmap.get(2);
        System.out.println();


        System.out.printf("Value at index 2 is: %s%n%n",myVar);

            hmap.remove(3);

            System.out.println("Map key & values after removal:");
            Set set2 = hmap.entrySet();
            Iterator iterator2 = set2.iterator();

            while(iterator2.hasNext()){
                Map.Entry mentry2 = (Map.Entry)iterator2.next();
                System.out.println("Key is: "+ mentry2.getKey() + " & Value is: "+ mentry2.getValue());

        }
    }
}
