import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompanyUsers {
     public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Map<String, List<String>> companies = new TreeMap<>();

         String input = "";

         while(!"End".equals(input = reader.readLine())){
             String[] command = input.split(" -> ");

             if(!companies.containsKey(command[0])){
                 List<String> initalEmployeeList = new ArrayList<>();
                 companies.put(command[0], initalEmployeeList);
             }
             if(companies.get(command[0]).indexOf(command[1]) == -1) {
                 companies.get(command[0]).add(command[1]);
             }
         }
         companies.entrySet()
                 .stream()
                 .forEach( e -> {
                     System.out.println(e.getKey());

                     for (int i = 0; i < e.getValue().size() ; i++) {
                         System.out.println(String.format("-- %s", e.getValue().get(i)));
                     }
                 });
      }
}
