
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class s893778513 {

    public static void main(String[] args) {
        canFormTriangle();
    }

    public static void canFormTriangle() {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String n = scanner.nextLine();
        String[] inputNumbers = scanner.nextLine().split(" ");

        // Parse input numbers into a list of integers
        List<Integer> l = new ArrayList<>();
        for (String numStr : inputNumbers) {
            l.add(Integer.parseInt(numStr));
        }

        // Find the maximum value in the list
        int b = Collections.max(l);

        // Calculate the sum of the list
        int s = l.stream().mapToInt(Integer::intValue).sum();

        // Check if the maximum value is less than the sum of the rest
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

