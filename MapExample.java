import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String args[]){
		Map <String, String> myMap = new HashMap<>();
		
		myMap.put("2222","ghi");
		myMap.put("3333", "abc");
		myMap.put("1111","def");
		
		myMap.forEach((k,v) -> System.out.println(k + "|" + v));
	    myMap.replaceAll((k, v) ->v.toUpperCase());
	    myMap.forEach((k,v) -> System.out.println(k + "|" + v));
	}
	
	
	
	
}
