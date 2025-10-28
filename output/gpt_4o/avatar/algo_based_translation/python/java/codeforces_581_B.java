
import java.util.Scanner;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];
        String[] input = scanner.nextLine().trim().split(" ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] ans = new int[n];
        int mx = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}

