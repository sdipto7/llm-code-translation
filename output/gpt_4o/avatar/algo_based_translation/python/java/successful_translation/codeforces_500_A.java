
import java.util.Scanner;

public class codeforces_500_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Read input for n and t
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        // Step 3: Declare and initialize variables
        int[] s = new int[n];
        for (int i = 0; i < n - 1; i++) {
            s[i] = scanner.nextInt();
        }
        int currentCell = 1;

        // Step 5: Begin processing the game logic
        while (currentCell < t) {
            // Step 6: Update currentCell
            currentCell += s[currentCell - 1];
        }

        // Step 7: Check if currentCell is equal to t
        if (currentCell == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}

