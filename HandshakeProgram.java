import java.util.Scanner;

public class HandshakeProgram {

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculation
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println("Maximum number of handshakes: " + handshakes);

        sc.close();
    }
}