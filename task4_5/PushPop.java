package task4_5;
import java.util.Stack;
class PushPop {
    private Stack<Integer> stack = new Stack<>();
    public void pushElement(int num) {
        stack.push(num);
        System.out.println(num + " pushed onto stack.");
    }
    public void popElement() {
        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        } else {
            System.out.println("Stack is empty! Cannot pop.");
        }
    }
    public void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents: " + stack);
        }
        
    }
}