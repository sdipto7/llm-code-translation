
import java.util.Scanner;
import java.util.Arrays;

public class s683277023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Reading
        String[] firstInputLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstInputLine[0]);
        int k = Integer.parseInt(firstInputLine[1]);

        // Variable Declarations
        int[] li = new int[n];

        // Input Parsing
        String[] secondInputLine = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            li[i] = Integer.parseInt(secondInputLine[i]);
        }

        // Sorting
        Arrays.sort(li);

        // Selection and Sum Calculation
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += li[i];
        }

        // Output
        System.out.println(sum);

        scanner.close();
    }
}

