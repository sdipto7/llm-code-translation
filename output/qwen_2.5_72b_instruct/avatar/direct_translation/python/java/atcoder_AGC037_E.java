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
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }
        if (aaaa) {
            char minChar = minChar(S);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                result.append(minChar);
            }
            System.out.println(result.toString());
            return;
        }
        S = getLastDict(S);
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
            if (count * Math.pow(2, K - 1) >= N) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < N; i++) {
                    result.append(S.charAt(0));
                }
                System.out.println(result.toString());
            } else {
                StringBuilder newS = new StringBuilder();
                for (int i = 0; i < count * (Math.pow(2, K - 1) - 1); i++) {
                    newS.append(S.charAt(0));
                }
                newS.append(S);
                System.out.println(newS.substring(0, N));
            }
        }
    }

    private static char minChar(String s) {
        char min = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c < min) {
                min = c;
            }
        }
        return min;
    }

    private static String getLastDict(String sStr) {
        String U = sStr + new StringBuilder(sStr).reverse().toString();
        char c = minChar(sStr);
        int p = U.indexOf(c);
        int minIndex = p;
        p++;
        while (p <= sStr.length()) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minIndex, p)) {
                    minIndex = p;
                }
            }
            p++;
        }
        return U.substring(minIndex, minIndex + sStr.length());
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length() / 2; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}
