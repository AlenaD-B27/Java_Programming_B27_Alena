package day46_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
        Stack
sub class of Vector

    LIFO: Last In First Out
Think of a stack of books
book3
book2
book1
book3 is on top of the stack
if you want to remove from the stack, book3 would be removed first you are left with
book2
book1

    methods related to LIFO:
 - push(): adding the element to the top of the stack. also returns the element added
 - pop(): removing the element at the top of the stack. also returns that element removed
 - peek(): returns the element at the top of the stack

    difference between add() and push():
    functions of both are the same.
    add method is coming from the Collection interface and the push method is defined in the Stack class
        - add method returns boolean
        - push method return the object added
         */

        Stack<String> stack = new Stack<>(); //LIFO - Last In First Out
        stack.push("a"); // push = add
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println("At the top: " + stack.peek());
        stack.pop(); // pop = remove (the element on the top of the stack and returns it), see line 18
        System.out.println("At the top: " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop() + " was removed from the stack");
        System.out.println(stack);


        // I can use the methods from List, but for Stack I want to use the function of LIFO
        System.out.println(stack.get(0));
        stack.add("h");


    }
}
