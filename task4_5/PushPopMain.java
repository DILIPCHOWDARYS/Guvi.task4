package task4_5;
import java.util.*;

public class PushPopMain {
    public static void main(String[] args) {
        PushPop pushpop = new PushPop();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose the operation:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Display the Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int num = sc.nextInt();
                    pushpop.pushElement(num);
                    break;
                case 2:
                    pushpop.popElement();
                    break;
                case 3:
                    pushpop.checkEmpty();
                    break;
                case 4:
                    pushpop.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();  // Close only when exiting
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
