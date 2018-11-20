package HashMaps;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForLoopHashMap {

    public static void main(String[] args) {


        HashMap <Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(11, "Java");
        hmap.put(21, "JavaScript");
        hmap.put(5, "Python");
        hmap.put(43, "PHP");
        hmap.put(3, "C");

        System.out.println("For Loop:");

        for(Map.Entry me: hmap.entrySet()){
            System.out.printf("Key: %d & Value: %s %n",me.getKey(), me.getValue());
        }

        //wWhile Loop & Iterator
        System.out.println();
        System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();

        while(iterator.hasNext()){

            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.printf("Key: %d & Value: %s %n",me2.getKey(), me2.getValue());

        }



    }
}
