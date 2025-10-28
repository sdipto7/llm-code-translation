
import java.util.Scanner;

public class codeforces_350_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        int[] ans = new int[n];
        int maxLength = 0;

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int[] crt = new int[n];
                int length = 0;
                int x = i;
                crt[length++] = x;
                x = a[x];
                while (cnt[x] == 1) {
                    crt[length++] = x;
                    x = a[x];
                }
                if (length > maxLength) {
                    maxLength = length;
                    ans = crt.clone();
                }
            }
        }

        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = ans[maxLength - 1 - i];
        }

        System.out.println(maxLength);
        for (int i = 0; i < maxLength; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

