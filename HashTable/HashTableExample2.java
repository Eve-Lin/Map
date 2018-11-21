package HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample2 {

    public static void main(String[] args) {

        Hashtable <String,String>htable = new Hashtable<String,String>();

        htable.put("winter", "go skating");
        htable.put("autumn", "go jogging");
        htable.put("summer", "go swimming");
        htable.put("spring", "go hiking");

        Set set = htable.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry newEntry = (Map.Entry)itr.next();
            System.out.printf("During the %s just %s.%n",newEntry.getKey(),newEntry.getValue());
        }
    }
}
