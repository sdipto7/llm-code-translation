
import java.util.Scanner;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int s_r = scanner.nextInt();
        int s_c = scanner.nextInt();
        String S = scanner.next();
        String T = scanner.next();
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
        for (int x = 0; x < N; x++) {
            char sChar = S.charAt(x);
            char tChar = T.charAt(x);
            if (sChar == 'L') {
                S_L++;
                if (S_L - T_R - s_c == 0) Judge = true;
            } else if (sChar == 'R') {
                S_R++;
                if (s_c + (S_R - T_L) == W + 1) Judge = true;
            } else if (sChar == 'U') {
                S_U++;
                if (S_U - T_D - s_r == 0) Judge = true;
            } else if (sChar == 'D') {
                S_D++;
                if (s_r + (S_D - T_U) == H + 1) Judge = true;
            }
            if (tChar == 'L') {
                if (S_R - T_L + s_c != 1) T_L++;
            } else if (tChar == 'R') {
                if (s_c + (T_R - S_L) != W) T_R++;
            } else if (tChar == 'U') {
                if (S_D - T_U + s_r != 1) T_U++;
            } else if (tChar == 'D') {
                if (s_r + (T_D - S_U) != H) T_D++;
            }
        }
        if (Judge) System.out.println("NO");
        else System.out.println("YES");
    }
}

