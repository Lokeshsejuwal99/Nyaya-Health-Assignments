# Generating Numbers from 1 to 100

## Overview

This project demonstrates two approaches to generating numbers from 1 to 100 in Python. The two methods used are:

1. Using a Python List (Array).
2. Using a Python Deque (as a Linked List).

Each approach has its own advantages and disadvantages, which are discussed below.

## Python Code

### 1. Using a List

```python
# Generate numbers from 1 to 100 using a list
numbers_list = [i for i in range(1, 101)]  # Create a list with numbers from 1 to 100

# Print the numbers
print(" ".join(map(str, numbers_list)))  # Output the numbers as a string
```


### 2. Using a deque

From collections import deque  # Import deque class

# Generate numbers from 1 to 100 using a deque
numbers_deque = deque(range(1, 101))  # Create a deque with numbers from 1 to 100

# Print the numbers
print(" ".join(map(str, numbers_deque)))  # Output the numbers as a string



Comparison of Lists vs. Deques
Lists (Array in Python)

## Advantages and Disadvantages

| Feature                             | Lists                                                | Deques (as Linked Lists)                               |
|-------------------------------------|------------------------------------------------------|--------------------------------------------------------|
| **Element Access**                  | Fast random access (O(1) time complexity)            | Slower random access (O(n) time complexity)            |
| **Memory Efficiency**               | More memory-efficient due to contiguous storage      | Higher memory usage due to additional pointers         |
| **Insertions/Deletions at Ends**    | Slower at the ends (O(n) time complexity)            | Efficient at both ends (O(1) time complexity)          |
| **Insertions/Deletions in Middle**  | Slower due to element shifting                       | Similar slow performance for non-end operations        |
| **Resizing Overhead**               | May require memory reallocation and copying          | No resizing overhead due to dynamic sizing             |


Conclusion

    Use a List: When you need fast access to elements by index and your operations primarily involve accessing or modifying elements without frequent insertions or deletions in the middle.
    Use a Deque: When your application requires efficient insertions and deletions at both ends, such as in queue or stack implementations, and random access is not a priority.