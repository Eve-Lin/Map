import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_07 {
     public static void main(String[] args) throws IOException {

          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         Map<String, List<Double>> students = new HashMap<>();

         int n = Integer.parseInt(reader.readLine());

         for (int i = 0; i < n; i++) {
             String studentName = reader.readLine();
             double grade = Double.parseDouble(reader.readLine());


             if(!students.containsKey(studentName)){
                 List<Double> initialGradeList  = new ArrayList<>();
                 students.put(studentName, initialGradeList);
             }
             students.get(studentName).add(grade);
         }

                students.entrySet()
                 .stream()
                 .filter(e -> getAverage(e.getValue()) >= 4.50)
                        .sorted((a,b) -> {
                            int sort = Double.compare(getAverage(b.getValue()), getAverage(a.getValue()));
                            return sort;
                        })
                .forEach( e -> System.out.println(String.format("%s -> %.2f", e.getKey(), getAverage(e.getValue()))));

      }

      private static double getAverage(List<Double> e){
          double sum = 0;
          for (int i = 0; i < e.size(); i++) {
              sum += e.get(i);
          }
          double avg = sum / e.size();

          return avg;
      }
}
