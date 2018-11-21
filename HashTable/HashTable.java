package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable <String, String> htable = new Hashtable<String, String>();

        htable.put("Key1", "Name1");
        htable.put("Key2", "Name2");
        htable.put("Key3", "Name3");
        htable.put("Key4", "Name4");
        htable.put("Key5", "Name5");

        names = htable.keys();

        while (names.hasMoreElements()){

            key = (String) names.nextElement();
            System.out.printf("Key: %s & Value: %s.%n",key,htable.get(key));
        }


    }
}
