
import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if ((1 << K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            char minChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(minChar);
            }
            System.out.println(sb.toString());
            return;
        }

        S = getLastDict(S, N);
        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            char firstChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c == firstChar) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (1 << (K - 1)) >= N) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < N; i++) {
                    sb.append(firstChar);
                }
                System.out.println(sb.toString());
            } else {
                int prefixLength = count * ((1 << (K - 1)) - 1);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < prefixLength; i++) {
                    sb.append(firstChar);
                }
                sb.append(S);
                System.out.println(sb.substring(0, N));
            }
        }
    }

    private static String getLastDict(String s_str, int N) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = getMinChar(s_str);
        int p = U.indexOf(c);
        int minindex = p;
        p += 1;
        while (p <= N) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minindex, p, N)) {
                    minindex = p;
                }
            }
            p += 1;
        }
        return U.substring(minindex, minindex + N);
    }

    private static char getMinChar(String s) {
        char minChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
            }
        }
        return minChar;
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2, int N) {
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

