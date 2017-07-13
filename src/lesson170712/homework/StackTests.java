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

        System.out.println("E capacity: " + expectedStack.capacity());
        System.out.println("A capacity: " + actualStack.capacity());

        System.out.println("E size: " + expectedStack.size());
        System.out.println("A size: " + actualStack.size());

    }
}
