# Printing "Hello World" in Java

## Overview

In Java, the standard way to print "Hello World" involves using the `System.out.println()` method with a semicolon at the end. However, it is possible to achieve the same result without explicitly using a semicolon by leveraging alternative methods.

## Approach

Common approaches to print "Hello World" without using a semicolon are using static initializer block, for loop, if condition, switch statement.

## Using a Static Initializer Block

```java
public class HelloWorld {

    // Static initializer block
    static {
        System.out.println("Hello World");
        // The println statement is inside the static block and does not end with a semicolon directly in the main method.
    }

    public static void main(String[] args) {
        // The main method is empty since the output is handled by the static block.
    }
}
```
## Explanation
A static initializer block can be used to execute code when the class is loaded. Here's how you can use it to print "Hello World" without a semicolon:

## Using if statement
```java
public class Main {
    public static void main(String[] args) {
        // printf prints "Hello World" and returns a non-null PrintStream.
        if (System.out.printf("Hello World") != null) {}
    }
}
```
## Explanation

In this approach, we utilize the System.out.printf() method, which prints the string "Hello World" and returns a PrintStream object. Since the PrintStream object is not null, the condition in the if statement is always true. This allows the printf method to execute without needing a semicolon, effectively printing "Hello World".


## Using "for" loop.
```java
public class Main {
    public static void main(String[] args) {
        // for loop executes print statement in the third part.
        for (int i = 0; i < 1; System.out.println("Hello World")) {
            // Increment i to terminate the loop.
            i++; 
        }
    }
}
```
## Explanation

This approach embeds the System.out.println("Hello World") statement within the third part of a for loop. The for loop runs only once, and the print statement executes during the loop's "update" phase. The loop body is kept empty, and the loop condition ensures the print statement executes exactly once. This allows us to print "Hello World" without a semicolon after the print statement.


## Using switch statement
```java
public class Main {
    public static void main(String[] args) {
        // switch always matches case 0 and prints "Hello World".
        switch(0) {
            case 0: System.out.println("Hello World");
        }
    }
}
```


# Summary

Each of these methods leverages a control structure (if, for, static or switch) that allows the execution of the print statement without the need for a semicolon directly following it. This achieves the goal of printing "Hello World" in Java without using a semicolon in the traditional sense.