
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
            char minChar = findMinChar(S);
            System.out.println(new String(new char[N]).replace("\0", String.valueOf(minChar)));
            return;
        }
        S = get_last_dict(S);
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
                System.out.println(new String(new char[N]).replace("\0", String.valueOf(S.charAt(0))));
            } else {
                StringBuilder newS = new StringBuilder();
                newS.append(String.valueOf(S.charAt(0)).repeat(count * (int) (Math.pow(2, K - 1) - 1)));
                newS.append(S);
                System.out.println(newS.substring(0, N));
            }
        }
    }

    public static String get_last_dict(String s_str) {
        String U = s_str + new StringBuilder(s_str).reverse().toString();
        char c = findMinChar(s_str);
        int p = U.indexOf(c);
        int minindex = p;
        p++;
        while (p <= s_str.length()) {
            if (U.charAt(p) == c) {
                if (check_normal_dict(U, minindex, p)) {
                    minindex = p;
                }
            }
            p++;
        }
        return U.substring(minindex, minindex + s_str.length());
    }

    public static boolean check_normal_dict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length() / 2; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }

    public static char findMinChar(String s) {
        char minChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c < minChar) {
                minChar = c;
            }
        }
        return minChar;
    }
}

