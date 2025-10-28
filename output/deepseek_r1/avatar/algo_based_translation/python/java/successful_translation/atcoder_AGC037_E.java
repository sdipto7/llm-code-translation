
import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        boolean earlyExit = false;
        if (K >= 15) {
            earlyExit = true;
        } else if ((1 << K) >= N) {
            earlyExit = true;
        }

        if (earlyExit) {
            char minChar = findMinChar(S);
            System.out.println(String.valueOf(minChar).repeat(N));
            return;
        }

        S = getLastDict(S);

        if (K == 1) {
            System.out.println(S);
        } else {
            int count = 0;
            char firstChar = S.charAt(0);
            while (count < S.length() && S.charAt(count) == firstChar) {
                count++;
            }
            int multiplier = 1 << (K - 1);
            if (count * multiplier >= N) {
                System.out.println(String.valueOf(firstChar).repeat(N));
            } else {
                String prepend = String.valueOf(firstChar).repeat(count * (multiplier - 1));
                String result = prepend + S;
                System.out.println(result.substring(0, N));
            }
        }
    }

    private static String getLastDict(String sStr) {
        int n = sStr.length();
        String reversed = new StringBuilder(sStr).reverse().toString();
        String U = sStr + reversed;
        char minChar = findMinChar(sStr);
        int minIndex = U.indexOf(minChar);

        for (int p = minIndex + 1; p <= n; p++) {
            if (U.charAt(p) == minChar && checkNormalDict(U, minIndex, p, n)) {
                minIndex = p;
            }
        }
        return U.substring(minIndex, minIndex + n);
    }

    private static boolean checkNormalDict(String u, int ptr1, int ptr2, int length) {
        for (int i = 0; i < length; i++) {
            char c1 = u.charAt(ptr1 + i);
            char c2 = u.charAt(ptr2 + i);
            if (c1 > c2) return true;
            if (c1 < c2) return false;
        }
        return false;
    }

    private static char findMinChar(String s) {
        char min = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < min) min = s.charAt(i);
        }
        return min;
    }
}

