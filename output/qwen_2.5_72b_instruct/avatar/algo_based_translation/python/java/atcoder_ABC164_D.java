
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        List<Integer> m = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            m.add(0);
        }
        m.set(0, 1);
        int a = 0;
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(s.length() - 1 - i);
            a += (Character.getNumericValue(e) * powMod(10, i, l)) % l;
            r += m.get(a % l);
            m.set(a % l, m.get(a % l) + 1);
        }
        System.out.println(r);
    }

    public static int powMod(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}

