
import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine().trim());
        String S = scanner.nextLine().trim();
        calculate(N, S);
    }

    public static void calculate(int n, String s) {
        char[] arr = s.toCharArray();
        int rNum = 0;
        int gNum = 0;
        int bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            else if (c == 'G') gNum++;
            else if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= (n + 1) / 2; step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String str = "" + arr[i] + arr[i + step] + arr[i + step * 2];
                if (str.equals("RGB") || str.equals("RBG") || str.equals("BGR") || str.equals("BRG") || str.equals("GBR") || str.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}

