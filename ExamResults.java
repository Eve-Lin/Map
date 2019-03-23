import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ExamResults {

     public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Map<String, Integer> users = new HashMap<>();
         Map<String, Integer> languages = new HashMap<>();


         String input = "";

         while(!"exam finished".equals(input = reader.readLine())){

             String[] command = input.split("\\-");

             if(command[1].equals("banned")){
                 users.remove(command[0]);
             }else {
                  int points = Integer.parseInt(command[2]);
                 if (!users.containsKey(command[0])) {
                     users.put(command[0], 0);
                 }
                 if(points > users.get(command[0])) {
                     users.put(command[0], points);
                 }
                 if (!languages.containsKey(command[1])) {
                     languages.put(command[1], 0);
                 }
                 languages.put(command[1], languages.get(command[1]) + 1);
             }
         }
         System.out.println("Results:");
         users.entrySet()
                 .stream()
                 .sorted((a, b) -> {
                     int sort = Integer.compare(b.getValue(), (a.getValue()));

                     if (sort == 0) {
                         sort = a.getKey().compareTo(b.getKey());
                     }
                     return sort;
                 })
                 .forEach(e -> {
                     System.out.println(String.format("%s | %d", e.getKey(), e.getValue()));

                 });

         System.out.println("Submissions:");

         languages.entrySet()
                 .stream()
                 .sorted((a, b) -> {
                     int sort = Integer.compare(b.getValue(), (a.getValue()));

                     if (sort == 0) {
                         sort = a.getKey().compareTo(b.getKey());
                     }
                     return sort;
                 })
                 .forEach(e -> {
                     System.out.println(String.format("%s - %d", e.getKey(), e.getValue()));

                 });
      }

}
