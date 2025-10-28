
import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = 2019;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        long a = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(s.length() - 1 - i);
            a += Character.getNumericValue(e) * pow(10, i, l);
            int mod = (int) (a % l);
            r += m.getOrDefault(mod, 0);
            m.put(mod, m.getOrDefault(mod, 0) + 1);
        }
        System.out.println(r);
    }

    private static long pow(int base, int exponent, int mod) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % mod;
        }
        return result;
    }
}

