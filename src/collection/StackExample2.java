package collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Andrew");
        stack.push("Max");
        stack.push("Fabio");
        stack.push("Kate");
        System.out.println(stack);

        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println();
        }
    }
}
