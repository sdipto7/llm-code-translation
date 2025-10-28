
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
        int rNum = countChar(arr, 'R');
        int gNum = countChar(arr, 'G');
        int bNum = countChar(arr, 'B');
        int sum = 0;
        for (int step = 1; step <= Math.ceil((double) n / 2); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String str = String.valueOf(arr[i]) + arr[i + step] + arr[i + 2 * step];
                if (str.equals("RGB") || str.equals("RBG") || str.equals("BGR") || str.equals("BRG") || str.equals("GBR") || str.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
    private static int countChar(char[] arr, char c) {
        int count = 0;
        for (char ch : arr) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}

