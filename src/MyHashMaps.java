import java.util.HashMap;
import java.util.Map;

public class MyHashMaps {
	
	
	public static void TestMyHashMappings() {
		
		/*  It is a Key value pair
		 * cannot have duplicate value only the last defined will stick
		 * not sorted in any way so iterating through will not be in a certain order.
		 */
		
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		
		myMap.put(1, "One");
		myMap.put(2, "Two");
		myMap.put(3, "Three");
		myMap.put(4, "Four");
		myMap.put(5, "Five");
		myMap.put(6, "Six");
		
		String value = myMap.get(3);
		
		for (Map.Entry<Integer, String> entry: myMap.entrySet()) {
			int key = entry.getKey();
			value = entry.getValue();
			
			System.out.println(key +": " + value);
		}
	
	}

	
	
}
