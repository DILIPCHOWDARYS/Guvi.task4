package task4_2;
import java.util.Scanner;
public class VoterManagement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Voter ID: ");
            String voterId = scanner.next();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            Voter voter = new Voter(voterId, name, age);
            voter.display();
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
            scanner.close();
        
}
}
