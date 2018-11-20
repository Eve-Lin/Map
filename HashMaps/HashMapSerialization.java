package HashMaps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class HashMapSerialization {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(33, "me");
        hmap.put(31, "Dog");
        hmap.put(3, "Dolphin");
        hmap.put(17, "Eagle");

        try{
            FileOutputStream fos = new FileOutputStream("hashmap.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hmap);
            oos.close();
            fos.close();
            System.out.println("Serialized HashMap data is saved in hashmap.ser");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }


}
