
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] ans = calculateDifferences(n, arr);
        System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
    }

    public static int[] calculateDifferences(int n, int[] arr) {
        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return ans;
    }
}

