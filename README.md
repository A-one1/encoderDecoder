# Encoder/Decoder classes
In this assignment you will be implementing multiple classes in order to create a simplistic encoder and decoder. You will create a class that defines an object that can be used to encode a message from a character array to an integer array and then you will also have a class that will be used to decode a message from an integer array to a character array. You’ll also have a tester class with your actual `main()` method in it to make use of the other two classes, so in total you will work on three different files. Your program should take in a `String` message in the main, which will then be encoded and decoded. Your encoder/decoder should have two methods of encoding, one that is a straight conversion and one that takes in an additional `int offset` as a parameter. The offset version means that it will not translate directly, but need that offset to correctly decode.

`Encoder` class requirements:
1. One method `public int[] encode(String message)` that converts a string into an array of integers and returns it.
1. One method `public int[] encode(String message, int offset)` that converts a string into an array of integers, adds the offset value to each item in the array, and returns the array.

```java
public class Encoder {
    // Attributes
    /* YOUR CODE HERE */

    //Constructors
    /* YOUR CODE HERE */

    //Methods
    /* YOUR CODE HERE */
}
```

`Decoder` class requirements:
1. One method `public String decode(int[] secretMessage)` that converts an array of integers into a String and returns it.
1. One method `public String encode(String secretMessage, int offset)` that subtracts the offset value from each element in the array of integers, converts the array of integers into a String and returns it.

```java
public class Decoder {
    // Attributes
    /* YOUR CODE HERE */

    //Constructors
    /* YOUR CODE HERE */

    //Methods
    /* YOUR CODE HERE */
}
```

Example tester program:

```java
public class Main {
    public static void main(String[] args) {
        /* YOUR CODE HERE */
    }
}
```

Hints:
1. You are not required, but you **CAN** create auxiliary attributes, methods, and constructors for each class.
1. `char` can be directly assigned to `int` variables, example: [https://www.javatpoint.com/java-char-to-int](https://www.javatpoint.com/java-char-to-int).
1. You can **cast** `int` variables into `char` types: [https://www.javatpoint.com/java-int-to-char](https://www.javatpoint.com/java-int-to-char).
1. The ASCII table will likely be a good way to see that your message is encoding correctly [http://www.asciitable.com/](http://www.asciitable.com/).
1. Test individual pieces at a time instead of writing the entire thing and then testing.
1. You should not have a main statement in your encoder or decoder class.
1. You will have a total of three files. Each file will be a different class, one as the `Encoder`, one as the `Decoder`, and then one with your `main()` method to test and run the other two.
1. Grading does not take the `main()` implementation into account, so you are free to test the other two classes however you want, for example getting input from the user vs hardcoding values into the source code.

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
