package pg1b;
import java.util.*;
public class LinkedListIterator {

	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        // Creating an iterator starting from index 1 (2nd element)
	        ListIterator<String> iterator = colors.listIterator(1);

	        System.out.println("Iterating from 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
