import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_01 {

     public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



          String text = String.join("",reader.readLine().split("\\s+"));

         Map<Character, Integer> characters = new LinkedHashMap<>();

         for (int i = 0; i < text.length(); i++) {

           char charInput = text.charAt(i);

             if(!characters.containsKey(charInput)){
                 characters.put(charInput, 1);
             }else{
                 characters.put(charInput, characters.get(charInput) + 1);
             }


         }
characters.entrySet().stream()
        .forEach( e -> System.out.println(String.format("%s -> %d", e.getKey(), e.getValue())));

}
}



//
//         List<Integer> nums = new ArrayList<>();
//         nums.add(50);
//         nums.add(10);
//         nums.add(5);
//
//
//         nums.stream().sorted(Collections.reverseOrder())
//                 .forEach(System.out::println);
