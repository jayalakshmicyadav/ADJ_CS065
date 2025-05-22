package pg1b;
import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        // Using descendingIterator to iterate in reverse
        Iterator<String> reverseIterator = colors.descendingIterator();

        System.out.println("Reverse iteration:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
