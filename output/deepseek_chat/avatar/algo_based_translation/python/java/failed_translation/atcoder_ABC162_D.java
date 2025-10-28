
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
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
        int maxStep = (int) Math.ceil(n / 2.0);
        
        for (int step = 1; step <= maxStep; step++) {
            for (int i = 0; i <= n - 2 * step - 1; i++) {
                String triplet = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (triplet.equals("RGB") || triplet.equals("RBG") || 
                    triplet.equals("BGR") || triplet.equals("BRG") || 
                    triplet.equals("GBR") || triplet.equals("GRB")) {
                    sum++;
                }
            }
        }
        
        System.out.println(rNum * gNum * bNum - sum);
    }
}

