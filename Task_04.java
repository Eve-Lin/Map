import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_04 {

         public static void main(String[] args) throws IOException {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


             Map<String, double[]> products = new LinkedHashMap<>();



             String command = "";

             while(!"buy".equals(command = reader.readLine())){
                 double[] priceAndQuantity = new double[2];
                 String[] input = command.split(" ");
                 double quantity = Double.parseDouble(input[2]);
                 double price = Double.parseDouble(input[1]);






                 if(!products.containsKey(input[0])){
                     double[] nullArray = new double[2];
                     products.put(input[0], nullArray);
                 }
                 priceAndQuantity[0] = price;
                 priceAndQuantity[1] =  products.get(input[0])[1] + quantity;
                 products.put(input[0], priceAndQuantity );
             }

             products.entrySet()
                     .stream()
                     .forEach( e -> System.out.println(String.format("%s -> %.2f", e.getKey(), (e.getValue()[0] * e.getValue()[1]))));

          }
    }

