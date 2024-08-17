public class ArrayDeletion { // Define a class named ArrayDeletion
 public static int[] deleteElement(int[] arr, int index) { // Method to delete an element at a specific index
     if (index < 0 || index >= arr.length) { // Check if the index is within the valid range
         System.out.println("Index out of bounds"); // Print error message if the index is invalid
         return arr; // Return the original array without changes
     }

     int[] newArr = new int[arr.length - 1]; // Create a new array with one less element than the original

     for (int i = 0, k = 0; i < arr.length; i++) { // Loop through the original array
         if (i == index) continue; // Skip the element at the specified index
         newArr[k++] = arr[i]; // Copy elements to the new array
     }

     return newArr; // Return the new array without the deleted element
 }

 public static void main(String[] args) { // Main method to run the program
     int[] array = {1, 2, 3, 4, 5}; // Initialize an array with values 1 to 5
     int indexToDelete = 2; // Specify the index of the element to delete (index 2)
     array = deleteElement(array, indexToDelete); // Call the deleteElement method to remove the element
     for (int i : array) { // Loop through the modified array
         System.out.print(i + " "); // Print each element in the array
     }
 }
}
