# Define an iterator using the iter() function and range object
iterator = iter(range(1, 6))  # Creates an iterator that will iterate over numbers 1 to 5

# Convert the iterator to a list using the list() function
list_from_iterator = list(iterator)  # Pass the iterator to list() to get a list of its elements

# Print the resulting list
print(list_from_iterator)  # Output: [1, 2, 3, 4, 5]
