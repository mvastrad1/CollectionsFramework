import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MySortedHashMaps {


	public static void testSortedHashMaps() {
	/* Hash maps store hash code of previous and next objects
	 * 
	 */
	
	//Order is not always same when you iterate and read them in HashMaps
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	// maintains the order you put things in to the map 
	LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
	
	// puts it in a natural order
	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

	testMap(hashMap, "Hash Map");
	testMap(linkedHashMap, "Linked Hash Map");
	testMap(treeMap, "Tree Map");
	
	}
	

	public static void testMap(Map<Integer, String> map, String mapType)  {
		
		map.put(10, "fox");
		map.put(2, "dog");
		map.put(9, "cat");
		map.put(5, "giraffe");
		map.put(7, "bat");
		map.put(1, "Snake");

		System.out.println(mapType); 
		for (Integer key: map.keySet()) {
			String value = map.get(key) ;
			System.out.println("Key :" + key + " Value :" +value );
		}
		System.out.println(); 
		
		
	}

}
