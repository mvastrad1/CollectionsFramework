import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

 public static void TestArrayList()
 {
	//Array List
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(0);
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(50);
	numbers.add(60);
	
	for (Integer value: numbers) {
		System.out.println(value);
	}
	
	//remving last item in the list will not have impact on performance but 
	//remvoing first or middle item in the big list will have performance impact
	numbers.remove(numbers.size()-1);
	numbers.remove(0);
	System.out.println("After removing items");
	for (Integer value: numbers) {
		System.out.println(value);
	}

	//List
	List<String> myList = new ArrayList<String>();
	myList.add("One");
	myList.add("Two");
	myList.add("Three");
	
	for (String value: myList) {
		System.out.println(value);
	}
	
	
}

	
}
