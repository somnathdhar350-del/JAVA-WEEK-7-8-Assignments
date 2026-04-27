import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to find sum
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to find mean
    public static double getMean(int[] arr) {
        int sum = getSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Generate heights for 11 players
        int[] heights = generateHeights(11);

        // Display heights
        System.out.println("Player Heights (in cm): ");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Calculations
        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        // Output
        System.out.println("\n\nSum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}