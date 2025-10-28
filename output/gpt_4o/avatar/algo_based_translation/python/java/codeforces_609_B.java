
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Read the list of integers
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }

        // Create a map to count occurrences
        Map<Integer, Integer> l = new HashMap<>();

        // Populate the map with occurrence counts
        for (int i = 0; i < n; i++) {
            l.put(lst[i], l.getOrDefault(lst[i], 0) + 1);
        }

        // Calculate the result
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }

        // Output the result
        System.out.println(res);

        scanner.close();
    }
}

