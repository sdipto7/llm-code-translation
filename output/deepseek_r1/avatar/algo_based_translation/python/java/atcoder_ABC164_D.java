
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = 2019;
        int[] m = new int[l + 1];
        m[0] = 1;
        int a = 0;
        int r = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char digitChar = s.charAt(length - 1 - i);
            int digit = Character.getNumericValue(digitChar);
            int power = powMod(10, i, l);
            a = (a + digit * power) % l;
            r += m[a];
            m[a]++;
        }
        
        System.out.println(r);
    }
    
    private static int powMod(int base, int exponent, int mod) {
        int result = 1;
        base %= mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}

