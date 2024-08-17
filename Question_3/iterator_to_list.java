import java.util.ArrayList;    // Import ArrayList class
import java.util.Iterator;     // Import Iterator interface
import java.util.List;         // Import List interface
import java.util.Arrays;       // Import Arrays class for utility methods

public class IteratorToListExample {
    public static void main(String[] args) {
        // Create a list with some initial values
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);  // Initialize a list with integers 1 to 5

        // Obtain an iterator from the list
        Iterator<Integer> iterator = list.iterator();  // Get an iterator to traverse the list

        // Create an empty list to store elements from the iterator
        List<Integer> listFromIterator = new ArrayList<>();  // Initialize an empty ArrayList to store the elements

        // Iterate over the iterator and add elements to the new list
        while (iterator.hasNext()) {            // Check if there are more elements in the iterator
            listFromIterator.add(iterator.next());  // Add the next element from the iterator to the new list
        }

        // Print the resulting list
        System.out.println(listFromIterator);  // Output: [1, 2, 3, 4, 5]
    }
}
