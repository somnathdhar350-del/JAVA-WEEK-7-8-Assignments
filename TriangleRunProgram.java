import java.util.Scanner;

public class TriangleRunProgram {

    // Method to calculate number of rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        // Calculation
        double rounds = calculateRounds(a, b, c);

        // Output
        System.out.println("Number of rounds required to complete 5 km: " + rounds);

        sc.close();
    }
}