package lesson170712.homework;

/**
 * Created by megmeehey on 14.07.17.
 */
public class StackTests {
    public static void main(String[] args) {
        java.util.Stack<String> expectedStack = new java.util.Stack<>();
        Stack<String> actualStack = new Stack<>(10);

        System.out.println("Expected (E:)");
        System.out.println("Actual (A:)");
        expectedStack.push("People");
        expectedStack.push("don't");
        expectedStack.push("have");
        expectedStack.push("claws");

        System.out.println("E: " + expectedStack);

        actualStack.push("People");
        actualStack.push("don't");
        actualStack.push("have");
        actualStack.push("claws");

        System.out.println("A: " + actualStack);

        expectedStack.push(" ");
        expectedStack.push("Wolves");
        expectedStack.push("have");

        actualStack.push(" ");
        actualStack.push("Wolves");
        actualStack.push("have");


        System.out.println("E capacity: " + expectedStack.capacity());
        System.out.println("A capacity: " + actualStack.capacity());

        System.out.println("E size: " + expectedStack.size());
        System.out.println("A size: " + actualStack.size());

        System.out.println("E empty? " + expectedStack.empty());
        System.out.println("A empty? " + actualStack.empty());

        System.out.println("Taking one element");
        System.out.println(expectedStack.pop());
        System.out.println(actualStack.pop());

        System.out.println("Taking another element");
        System.out.println(expectedStack.pop());
        System.out.println(actualStack.pop());

        System.out.println("Taking third element");
        System.out.println(expectedStack.pop());
        System.out.println(actualStack.pop());

        System.out.println(expectedStack);
        System.out.println(actualStack);

        expectedStack.pop();
        expectedStack.pop();
        expectedStack.pop();
        expectedStack.pop();
        System.out.println(expectedStack.empty());

        actualStack.pop();
        actualStack.pop();
        actualStack.pop();
        actualStack.pop();
        System.out.println(actualStack.empty());
    }
}
