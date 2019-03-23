import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_02 {

     public static void main(String[] args) throws IOException {


          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          String resource = "";

         Map<String, Integer> resources = new LinkedHashMap<>();
          while (!"stop".equals(resource = reader.readLine())){

              int quantity = Integer.parseInt(reader.readLine());

              if(!resources.containsKey(resource)) {
                  resources.put(resource, 0);
              }
              resources.put(resource, resources.get(resource) + quantity);


          }

         for (Map.Entry<String, Integer> result: resources.entrySet()
              ) {

             System.out.println(String.format("%s -> %d", result.getKey(), result.getValue()));

         }
      }
}
