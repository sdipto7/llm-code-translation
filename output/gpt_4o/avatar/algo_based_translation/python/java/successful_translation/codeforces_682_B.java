
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer n
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        // Read the list of integers
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }

        // Sort the list
        Arrays.sort(l);

        int c = 0;

        // Iterate over each element in the sorted list
        for (int i : l) {
            if (i > c) {
                c++;
            }
        }

        // Output the result
        System.out.println(c + 1);
    }
}

