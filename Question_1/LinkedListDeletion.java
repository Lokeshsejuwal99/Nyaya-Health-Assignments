class Node { // Define a class named Node to represent a node in the linked list
 int data; // Integer data field to store the value of the node
 Node next; // Node reference to point to the next node in the list

 Node(int data) { // Constructor to initialize the node with a value
     this.data = data; // Assign the given data to the data field
     this.next = null; // Initialize the next pointer to null
 }
}

class LinkedList { // Define a class named LinkedList to represent the linked list
 Node head; // Node reference to point to the head (first) node of the list

 public void append(int data) { // Method to add a new node at the end of the list
     if (head == null) { // Check if the list is empty
         head = new Node(data); // Create a new node and set it as the head
         return; // Exit the method
     }
     Node current = head; // Start from the head node
     while (current.next != null) { // Traverse the list to find the last node
         current = current.next; // Move to the next node
     }
     current.next = new Node(data); // Create a new node and link it to the last node
 }

 public void delete(int key) { // Method to delete a node with a specific value
     Node current = head; // Start from the head node
     Node prev = null; // Initialize the previous node reference as null

     if (current != null && current.data == key) { // Check if the head node contains the key
         head = current.next; // Update the head to the next node
         return; // Exit the method
     }

     while (current != null && current.data != key) { // Traverse the list to find the node with the key
         prev = current; // Update the previous node to the current node
         current = current.next; // Move to the next node
     }

     if (current == null) return; // If the key is not found, exit the method

     prev.next = current.next; // Bypass the node with the key by updating the next pointer of the previous node
 }

 public void printList() { // Method to print all elements of the linked list
     Node current = head; // Start from the head node
     while (current != null) { // Traverse the list
         System.out.print(current.data + " "); // Print the data of the current node
         current = current.next; // Move to the next node
     }
     System.out.println(); // Print a newline after the list
 }

 public static void main(String[] args) { // Main method to run the program
     LinkedList list = new LinkedList(); // Create a new linked list
     list.append(1); // Add the element 1 to the list
     list.append(2); // Add the element 2 to the list
     list.append(3); // Add the element 3 to the list
     list.append(4); // Add the element 4 to the list
     list.append(5); // Add the element 5 to the list

     System.out.println("Original linked list:"); // Print the original list message
     list.printList(); // Print the original linked list

     list.delete(3); // Delete the node with value 3

     System.out.println("Linked list after deletion:"); // Print the modified list message
     list.printList(); // Print the linked list after deletion
 }
}
