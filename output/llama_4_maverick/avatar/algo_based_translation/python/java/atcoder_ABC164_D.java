
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        int l = 2019;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] m = new int[l + 1];
        m[0] = 1;
        long a = 0;
        long r = 0;
        for (int i = 0; i < s.length(); i++) {
            int e = Character.getNumericValue(s.charAt(s.length() - 1 - i));
            a = (a + (long)e * pow(10, i, l)) % l;
            r += m[(int)a];
            m[(int)a]++;
        }
        System.out.println(r);
    }

    public static long pow(long x, long y, long mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res;
    }
}

