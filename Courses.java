import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Courses {
     public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          Map<String, List<String>> courses = new LinkedHashMap<>();

          String input = "";

          while(!"end".equals(input = reader.readLine())){

              String[] command = input.split(" : ");


              if(!courses.containsKey(command[0])){
                  List<String> initialStudentList = new ArrayList<>();
                 courses.put(command[0],initialStudentList);
              }
              List<String> students = courses.get(command[0]);
              students.add(command[1]);
              Collections.sort(students);

         }

   courses.entrySet()
           .stream()
           .sorted((a, b) -> {
               int sort = Integer.compare(b.getValue().size(), a.getValue().size());

           return sort;           }
           )
           .forEach(e ->{
               System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));

               for (int i = 0; i < e.getValue().size(); i++) {

                   System.out.println(String.format("-- %s", e.getValue().get(i)));

               }
           });
      }
}
