import java.util.Scanner;

public class NaturalSumProgram {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check natural number
        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        // Output
        System.out.println("Sum using recursion: " + sum1);
        System.out.println("Sum using formula: " + sum2);

        // Comparison
        if (sum1 == sum2) {
            System.out.println("Both results are correct and equal ✅");
        } else {
            System.out.println("Results do not match ❌");
        }

        sc.close();
    }
}