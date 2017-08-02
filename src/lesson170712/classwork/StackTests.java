package lesson170712.classwork;

public class StackTests {
    public static void main(String[] args) {
        java.util.Stack<String> expectedStack = new java.util.Stack<>();
        Stack<String> actualStack = new Stack(10);

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

        System.out.println("E: " + expectedStack.peek());
        System.out.println("A: " + actualStack.peek());

        System.out.println("E: " + expectedStack.pop() + expectedStack.pop());
        System.out.println("A: " + actualStack.pop() + actualStack.pop());

        System.out.println("E empty? " + expectedStack.empty());
        System.out.println("A empty? " + actualStack.isEmpty());

        System.out.println("E size: " + expectedStack.size());
        System.out.println("A size: " + actualStack.size());

        expectedStack.pop();
        expectedStack.pop();
        expectedStack.pop();
        expectedStack.pop();
        expectedStack.pop();
        System.out.println(expectedStack.empty());

        actualStack.pop();
        actualStack.pop();
        actualStack.pop();
        actualStack.pop();
        actualStack.pop();
        System.out.println(actualStack.isEmpty());

        System.out.println("E empty now? " + expectedStack.empty());
        System.out.println("A empty now? " + actualStack.isEmpty());

    }
}
