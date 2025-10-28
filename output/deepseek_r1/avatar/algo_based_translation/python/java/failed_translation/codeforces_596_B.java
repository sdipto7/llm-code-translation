
import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = Integer.parseInt(inputValues[i]);
        }
        int result = calculateTotalAbsoluteDifference(n, r);
        System.out.println(result);
    }

    private static int calculateTotalAbsoluteDifference(int n, int[] r) {
        int ans = Math.abs(r[0]);
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        return ans;
    }
}

