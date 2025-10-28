
import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine(); // consume the remaining line
        String S = scanner.nextLine();

        boolean aaaa = false;

        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }

        if (aaaa) {
            char minChar = S.charAt(0);
            for (char c : S.toCharArray()) {
                if (c < minChar) {
                    minChar = c;
                }
            }
            System.out.println(String.valueOf(minChar).repeat(N));
            return;
        }

        S = getLastDict(S, N);

        if (K == 1) {
            System.out.println(S);
            return;
        }

        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == S.charAt(0)) {
                count++;
            } else {
                break;
            }
        }

        if (count * Math.pow(2, K - 1) >= N) {
            System.out.println(String.valueOf(S.charAt(0)).repeat(N));
        } else {
            StringBuilder result = new StringBuilder();
            result.append(String.valueOf(S.charAt(0)).repeat((int) (count * (Math.pow(2, K - 1) - 1))));
            result.append(S);
            System.out.println(result.substring(0, N));
        }
    }

    private static String getLastDict(String s_str, int N) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = s_str.charAt(0);
        for (char ch : s_str.toCharArray()) {
            if (ch < c) {
                c = ch;
            }
        }
        int p = U.indexOf(c);
        int minindex = p;
        p++;

        while (p <= N) {
            if (U.charAt(p) == c) {
                if (checkNormalDict(U, minindex, p, N)) {
                    minindex = p;
                }
            }
            p++;
        }
        return U.substring(minindex, minindex + N);
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

