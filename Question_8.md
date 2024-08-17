# Checking if a Number is a Perfect Square in Python

## Code

```python
import math  # Import math module for mathematical functions

def valid_square(num):
    # Check if the number is a positive integer
    if num < 0:
        return False  # Negative numbers cannot be square numbers

    # Calculate the square root of the number
    root = math.sqrt(num)  # Find the square root
    
    # Check if the square root is an integer
    return root.is_integer()  # Return True if root is an integer, else False

# Example usage
number = 36  # Number to check
print(f"Is {number} a valid square number? {valid_square(number)}")  # Output the result
```

# Explanation
Importing the math Module

* import math

    The math module is imported to utilize its mathematical functions. In this case, math.sqrt() is used to compute the square root of the given number.


* Defining the valid_square Function


```def valid_square(num):```

    This function takes one argument, num, which is the number to be checked if it is a perfect square.


* Checking for Negative Numbers


`` if num < 0:
    return False
``

    The function first checks if num is less than 0. Since negative numbers cannot be perfect squares, the function returns False immediately for such cases.

* Calculating the Square Root

```root = math.sqrt(num)```

    The math.sqrt(num) function calculates the square root of num. This value is stored in the variable root.

* Checking if the Square Root is an Integer

```return root.is_integer()```

    root.is_integer() checks whether the root value is an integer. If root is an integer, it implies that num is a perfect square, and the function returns True. Otherwise, it returns False.

# Example Usage

```python
number = 36
print(f"Is {number} a valid square number? {valid_square(number)}")


Here, number is set to 36, and valid_square is called with this value. The result is printed. For number = 36, the output is True because 36 is a perfect square (6 * 6 = 36).