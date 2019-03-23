import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = "";
        String winner = "";
        int points = 0;

        Map<String, Integer> materials = new TreeMap<>();
        materials.put("fragments", 0);
        materials.put("motes", 0);
        materials.put("shards", 0);
        Map<String, Integer> junk = new TreeMap<>();

        while(true) {
            command = scanner.nextLine().toLowerCase();

            String[] input = command.split("\\s+");

            for (int i = 1; i < input.length; i+=2) {

                    if (input[i].equals("shards") || input[i].equals("fragments") || input[i].equals("motes")) {

                            materials.put(input[i], materials.get(input[i]) + Integer.parseInt(input[i - 1]));


                        int value = materials.get(input[i]);
                        if(value >= 250){
                            points = value;
                            winner = input[i];

                                materials.put(input[i], materials.get(input[i]) - 250);

                            break;

                        }

                    } else {
                        if (!junk.containsKey(input[i])) {
                            junk.put(input[i], Integer.parseInt(input[i - 1]));
                        } else {
                            junk.put(input[i], junk.get(input[i]) + Integer.parseInt(input[i - 1]));
                        }
                    }

            }

            if(points >= 250){
                String result ="";
                if(winner.equalsIgnoreCase("fragments")){
                    result = "Valanyr";
                }else if(winner.equalsIgnoreCase("shards")){
                    result = "Shadowmourne";
                }else if(winner.equalsIgnoreCase("motes")){
                    result = "Dragonwrath";
                }
                System.out.println(String.format("%s obtained!", result));
                break;
            }


        }
materials.entrySet()
        .stream()
        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
        .forEach( e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));


        junk.entrySet()
                .stream()
                .forEach( e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));
    }
}
