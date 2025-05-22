package pg1b;

import java.util.*;

public class SwapLinkedListElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Before swapping: " + colors);

        // Swap 0th (first) and 2nd (third) elements
        Collections.swap(colors, 0, 2);

        System.out.println("After swapping first and third: " + colors);
    }
}
