
import java.util.Scanner;

public class s315467749 {
    public static int binarySearchCount(int[] S, int[] T, int n) {
        int ans = 0;
        for (int i : T) {
            if (i == S[0] || i == S[n - 1]) {
                ans++;
            } else {
                int left = 0;
                int right = n - 1;
                while (right - left > 1) {
                    int mid = (left + right) / 2;
                    if (S[mid] == i) {
                        ans++;
                        break;
                    } else if (S[mid] < i) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = scanner.nextInt();
        }
        System.out.println(binarySearchCount(S, T, n));
    }
}

