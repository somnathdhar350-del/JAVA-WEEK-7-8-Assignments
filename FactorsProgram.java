import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors and return as array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to find product
    public static long getProduct(int[] arr) {
        long product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    // Method to find sum of squares
    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get factors
        int[] factors = getFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        // Calculations
        int sum = getSum(factors);
        long product = getProduct(factors);
        double sumSquares = getSumOfSquares(factors);

        // Output
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);

        sc.close();
    }
}