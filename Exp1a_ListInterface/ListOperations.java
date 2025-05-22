package pg1;
import java.util.*; // Importing all utility classes

public class ListOperations {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements to both lists
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements using addAll()
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("First element in ArrayList: " + arrayList.get(0));
        System.out.println("First element in LinkedList: " + linkedList.get(0));

        // 5. Updating elements
        arrayList.set(2, "Kiwi"); // Replaces element at index 2
        linkedList.set(2, "Kiwi");

        // 6. Removing elements
        arrayList.remove("Banana"); // Remove by value
        linkedList.remove(3);       // Remove by index

        // 7. Searching elements using contains()
        System.out.println("ArrayList contains Mango? " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains Banana? " + linkedList.contains("Banana"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list using for-each loop
        System.out.println("\nArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nLinkedList elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // 10. Using Iterator
        System.out.println("\nIterating ArrayList using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println("\nIterating LinkedList using Iterator:");
        Iterator<String> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.println(linkedIterator.next());
        }

        // 11. Sorting the ArrayList and LinkedList
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Creating sublist
        List<String> arraySubList = arrayList.subList(1, 4);
        List<String> linkedSubList = linkedList.subList(0, 3);
        System.out.println("Sublist of ArrayList: " + arraySubList);
        System.out.println("Sublist of LinkedList: " + linkedSubList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\nArrayList after clear(): " + arrayList);
        System.out.println("LinkedList after clear(): " + linkedList);
    }
}

