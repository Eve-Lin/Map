import java.util.HashMap;

public class HashMapSize {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(5, "Return");
        hmap.put(17, "Run");
        hmap.put(1, "Read");
        hmap.put(3, "Relax");

        System.out.printf("Size of HashMap: %d", hmap.size());

    }
}
