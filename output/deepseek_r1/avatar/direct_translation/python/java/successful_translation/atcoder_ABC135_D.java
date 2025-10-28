
import java.util.*;

public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int n = S.length();
        int mod = (int)1e9 + 7;

        if (n == 1) {
            char c = S.charAt(0);
            System.out.println((c == '5' || c == '?') ? 1 : 0);
            return;
        }

        int[] previous = new int[13];
        char firstChar = S.charAt(0);
        if (firstChar == '?') {
            for (int j = 0; j < 10; j++) {
                previous[j] = 1;
            }
        } else {
            previous[firstChar - '0'] = 1;
        }

        for (int i = 1; i < n; i++) {
            int[] current = new int[13];
            char c = S.charAt(i);
            if (c != '?') {
                int d = c - '0';
                for (int k = 0; k < 13; k++) {
                    int newRem = (k * 10 + d) % 13;
                    current[newRem] = (current[newRem] + previous[k]) % mod;
                }
            } else {
                for (int d = 0; d < 10; d++) {
                    for (int k = 0; k < 13; k++) {
                        int newRem = (k * 10 + d) % 13;
                        current[newRem] = (current[newRem] + previous[k]) % mod;
                    }
                }
            }
            previous = current;
        }

        System.out.println(previous[5] % mod);
    }
}

