
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer input for N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Read string input for c
        String c = scanner.nextLine();

        // Calculate number of 'W' characters
        int num_w = 0;
        for (char ch : c.toCharArray()) {
            if (ch == 'W') {
                num_w++;
            }
        }

        // Calculate number of 'R' characters
        int num_r = N - num_w;

        // Construct the target ordered string
        StringBuilder comp = new StringBuilder();
        for (int i = 0; i < num_r; i++) {
            comp.append('R');
        }
        for (int i = 0; i < num_w; i++) {
            comp.append('W');
        }

        // Calculate the number of swaps needed
        int ans = 0;
        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }

        // Find the minimum of num_w, num_r, and ans
        ans = Math.min(Math.min(num_w, num_r), ans);

        // Output the result
        System.out.println(ans);

        scanner.close();
    }
}

