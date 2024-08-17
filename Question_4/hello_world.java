// Using "Static Initializer Block"
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


// Using "if" statement.

public class Main {
    public static void main(String[] args) {
        // printf prints "Hello World" and returns a non-null PrintStream.
        if (System.out.printf("Hello World") != null) {}
    }
}

// Using "for" loop.
public class Main {
    public static void main(String[] args) {
        // for loop executes print statement in the third part.
        for (int i = 0; i < 1; System.out.println("Hello World")) {
            // Increment i to terminate the loop.
            i++; 
        }
    }
}


// Using "switch" statement.
public class Main {
    public static void main(String[] args) {
        // switch always matches case 0 and prints "Hello World".
        switch(0) {
            case 0: System.out.println("Hello World");
        }
    }
}


