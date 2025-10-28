
import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        calculate(N, S);
        scanner.close();
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
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String combination = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (combination.equals("RGB") || combination.equals("RBG") || 
                    combination.equals("BGR") || combination.equals("BRG") || 
                    combination.equals("GBR") || combination.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}

