
import java.util.Scanner;

public class atcoder_AGC006_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input
        int n = Integer.parseInt(scanner.nextLine());
        
        // Read string inputs and convert them to character arrays
        char[] s = scanner.nextLine().toCharArray();
        char[] t = scanner.nextLine().toCharArray();
        
        // Compare the lists
        if (equals(s, t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            // Iterate over possible starting positions in s
            for (int i = 0; i < n; i++) {
                // Check for overlap
                for (int j = 0; j < n - i; j++) {
                    if (s[i + j] != t[j]) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            // Print the result
            System.out.println(2 * n - cnt);
        }
        
        scanner.close();
    }

    // Helper method to compare two character arrays
    private static boolean equals(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}

