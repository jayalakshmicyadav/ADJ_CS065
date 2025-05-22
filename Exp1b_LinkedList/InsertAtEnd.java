package pg1b;
import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        // Insert element at the end
        colors.offerLast("Pink");

        System.out.println("List after inserting 'Pink' at end: " + colors);
    }
}
