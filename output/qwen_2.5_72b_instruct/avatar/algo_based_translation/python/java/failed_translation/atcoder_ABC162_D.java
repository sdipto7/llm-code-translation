import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        calculate(n, s);
    }

    public static void calculate(int n, String s) {
        List<Character> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            arr.add(c);
        }
        int rNum = 0, gNum = 0, bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            else if (c == 'G') gNum++;
            else if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String substring = "" + arr.get(i) + arr.get(i + step) + arr.get(i + step * 2);
                if (substring.equals("RGB") || substring.equals("RBG") || substring.equals("BGR") || substring.equals("BRG") || substring.equals("GBR") || substring.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
