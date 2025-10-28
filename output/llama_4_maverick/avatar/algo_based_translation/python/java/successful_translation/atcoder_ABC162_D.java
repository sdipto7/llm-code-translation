
import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        calculate(N, S);
    }

    public static void calculate(int n, String s) {
        char[] arr = s.toCharArray();
        int rNum = 0, gNum = 0, bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            else if (c == 'G') gNum++;
            else if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i <= n - 2 * step - 1; i++) {
                String str = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (isPermutation(str, "RGB")) sum++;
            }
        }
        System.out.println((long)rNum * gNum * bNum - sum);
    }

    public static boolean isPermutation(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }
}

