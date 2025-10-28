
import java.util.Scanner;

public class atcoder_ABC164_D {

    public static int computeRemainders(String s) {
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char e = s.charAt(i);
            a = (a + Character.getNumericValue(e) * powerMod(10, s.length() - 1 - i, l)) % l;
            r += m[a];
            m[a]++;
        }
        
        return r;
    }

    private static int powerMod(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = computeRemainders(s);
        System.out.println(result);
        scanner.close();
    }
}

