import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_05 {
     public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          Map<String, String> users = new LinkedHashMap<>();

          int num = Integer.parseInt(reader.readLine());

          String input = "";

         for (int i = 0; i < num; i++) {
             input = reader.readLine();
             String[] command = input.split("\\s+");

             if(command[0].equals("register")){

                 if(!users.containsKey(command[1])){
                     users.put(command[1], command[2]);
                     System.out.println(String.format("%s registered %s successfully", command[1], command[2]));
                 }else {
                     System.out.println(String.format("ERROR: already registered with plate number %s", users.get(command[1])));
                 }

             }else if(command[0].equals("unregister")){
                 if(users.containsKey(command[1])){
                     users.remove(command[1]);
                     System.out.println(String.format("%s unregistered successfully", command[1]));
                 }else {
                     System.out.println(String.format("ERROR: user %s not found", command[1]));
                 }
             }

         }
         users.entrySet()
                 .stream().forEach(e -> System.out.println(String.format("%s => %s", e.getKey(), e.getValue())));
      }
}
