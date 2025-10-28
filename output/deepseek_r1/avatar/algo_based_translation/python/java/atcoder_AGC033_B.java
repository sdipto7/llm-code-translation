
import java.util.Scanner;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int sR = scanner.nextInt();
        int sC = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        
        boolean judge = false;
        int sL = 0, sR = 0, sU = 0, sD = 0;
        int tL = 0, tR = 0, tU = 0, tD = 0;
        
        for (int x = 0; x < N; x++) {
            char sMove = S.charAt(x);
            switch (sMove) {
                case 'L':
                    sL++;
                    if (sL - tR == sC) judge = true;
                    break;
                case 'R':
                    sR++;
                    if (sC + (sR - tL) == W + 1) judge = true;
                    break;
                case 'U':
                    sU++;
                    if (sU - tD == sR) judge = true;
                    break;
                case 'D':
                    sD++;
                    if (sR + (sD - tU) == H + 1) judge = true;
                    break;
            }
            
            char tMove = T.charAt(x);
            switch (tMove) {
                case 'L':
                    if (sR - tL + sC != 1) tL++;
                    break;
                case 'R':
                    if (sC + (tR - sL) != W) tR++;
                    break;
                case 'U':
                    if (sD - tU + sR != 1) tU++;
                    break;
                case 'D':
                    if (sR + (tD - sU) != H) tD++;
                    break;
            }
            
            if (judge) break;
        }
        
        System.out.println(judge ? "NO" : "YES");
    }
}

