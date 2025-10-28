
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of points n and the dimensionality d
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        // Initialize a list to store the points
        List<List<Integer>> points = new ArrayList<>();

        // Read the points
        for (int i = 0; i < n; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                point.add(scanner.nextInt());
            }
            points.add(point);
        }

        // Initialize count of integer distance pairs
        int count = 0;

        // Loop over the points to find integer distance pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isIntegerDistance(points.get(i), points.get(j), d)) {
                    count++;
                }
            }
        }

        // Print the count of integer distance pairs
        System.out.println(count);
    }

    // Function to calculate distance and check if it is an integer
    public static boolean isIntegerDistance(List<Integer> x, List<Integer> y, int d) {
        double tmp = 0.0;
        for (int i = 0; i < d; i++) {
            tmp += Math.pow(x.get(i) - y.get(i), 2);
        }
        double distance = Math.sqrt(tmp);
        return distance == Math.floor(distance);
    }
}

