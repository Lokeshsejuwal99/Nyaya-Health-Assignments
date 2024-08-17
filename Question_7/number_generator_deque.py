from collections import deque  # Import deque class

# Generate numbers from 1 to 100 using a linked list (deque)
numbers_deque = deque(range(1, 101))  # Create a deque with numbers from 1 to 100

# Print the numbers
print(" ".join(map(str, numbers_deque)))  # Output the numbers as a string
