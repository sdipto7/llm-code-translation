
import java.util.Scanner;

public class codeforces_581_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArr = scanner.nextLine().trim().split("\\s+");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        int[] ans = new int[n];
        if (n > 0) {
            int mx = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                ans[i] = Math.max(0, mx - arr[i] + 1);
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        scanner.close();
    }
}

