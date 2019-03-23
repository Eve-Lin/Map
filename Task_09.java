import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Task_09 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, TreeSet<String>> forceBook = new LinkedHashMap<>();

        String input = "";

        while (!"Lumpawaroo".equals(input = reader.readLine())) {

            String[] data = Arrays.stream(input.split("\\s+\\|\\s+|\\s+->\\s+"))
                    .toArray(String[]::new);


            if (input.contains(" | ")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                if (forceBook.entrySet().stream().noneMatch(e ->
                        e.getValue().contains(forceUser))) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                String forceSide = data[1];
                String forceUser = data[0];

                forceBook.forEach((key, value) -> {
                    value.remove(forceUser);

                });


                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }
                forceBook.get(forceSide).add(forceUser);
                System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));
            }
        }

        forceBook.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((a, b) -> {
                    int sort = Integer.compare(b.getValue().size(), (a.getValue().size()));

                    if (sort == 0) {
                        sort = a.getKey().compareTo(b.getKey());
                    }
                    return sort;
                })
                .forEach(e -> {
                    System.out.println(String.format("Side: %s, Members: %d", e.getKey(), e.getValue().size()));

                    Iterator iter = e.getValue().iterator();
                    while (iter.hasNext()) {
                        System.out.println(String.format("! %s", iter.next()));
                    }


                });
    }
}
