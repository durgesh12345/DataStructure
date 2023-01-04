package Stack;

import java.util.Stack;

public class AddingElement {
    public static void main(String[] args) {
        Stack stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        stack1.push(4);
        stack1.push("All");
        stack1.push("Geejs");

        stack2.push("geeks");
        stack2.push("for");
        stack2.push("geeks");
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println(stack1.peek());
        System.out.println(stack2.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1);
        System.out.println(stack2.pop());
        System.out.println(stack2);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.search(4));

    }
}
