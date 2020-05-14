import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	
	public static void TestLinkedList() {
		/*  Use array list when you want to add/remove only at the end
		 * uses array internally and traversing through is faster compare to Linked lists
		 * [1] [2] [3] [4]
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*  Use LinkedList when you want to add/remove in the middle or beginning
		 * [1] <-> [2] <-> [3]
		 *  elements keeps the reference to next and previous elements so adding elements anywhere will take same amount 
		 */
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList) ;
		doTimings("LinkedList", linkedList) ;
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		//add items at the end of list
		long start = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken " + (end - start) + "ms for adding at the end of  "+ type);
		

		//add items at the beginning of list
		start = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			list.add(0,i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken " + (end - start) + "ms for adding at the beginning of  "+ type);

		
	}
	
}
