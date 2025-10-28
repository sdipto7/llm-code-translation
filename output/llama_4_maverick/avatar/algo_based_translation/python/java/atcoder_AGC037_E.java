
import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        if (K >= 15 || (1 << K) >= N) {
            System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            return;
        }
        S = getLastDict(S, N);
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            for (char c : S.toCharArray()) {
                if (c == S.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (1 << (K - 1)) >= N) {
                System.out.println(String.valueOf(S.charAt(0)).repeat(N));
            } else {
                String prefix = String.valueOf(S.charAt(0)).repeat(count * ((1 << (K - 1)) - 1));
                System.out.println((prefix + S).substring(0, N));
            }
        }
    }

    public static String getLastDict(String sStr, int N) {
        String U = sStr + new StringBuilder(sStr).reverse().toString();
        char c = getMinChar(sStr);
        int p = U.indexOf(c);
        int minIndex = p;
        p++;
        while (p <= N) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minIndex, p, N)) {
                    minIndex = p;
                }
            }
            p++;
        }
        return U.substring(minIndex, minIndex + N);
    }

    public static char getMinChar(String s) {
        char min = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c < min) {
                min = c;
            }
        }
        return min;
    }

    public static boolean checkNormalDict(String u, int pointer1, int pointer2, int N) {
        for (int i = 0; i < N; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}

