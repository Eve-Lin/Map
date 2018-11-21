package TreeMaps;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapSubMap {

    public static void main(String[] args) {

        TreeMap <String,String> capitals = new TreeMap<String, String>();

        capitals.put("Bulgaria","Sofia");
        capitals.put("South Africa","Pretoria");
        capitals.put("Denmark","Copenhagen");
        capitals.put("Germany","Berlin");

        System.out.println("TreeMap contains: "+ capitals);

        SortedMap<String,String> subMap = capitals.subMap("Bulgaria", "South Africa"); //including firstKey, excluding secondKey
        System.out.println("The SubMap contains: " + subMap);
        subMap.remove("Germany");   //affects the original TreeMap as well
        System.out.println();
        System.out.println("Original TreeMap: " + capitals);
        System.out.println("SubMap: " + capitals);
    }
}
