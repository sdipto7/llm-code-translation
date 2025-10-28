
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = 2019;
        int[] m = new int[l + 1];
        m[0] = 1;
        for (int i = 1; i <= l; i++) {
            m[i] = 0;
        }
        long a = 0;
        long r = 0;
        String reversed = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            char e = reversed.charAt(i);
            int digit = Character.getNumericValue(e);
            long power = 1;
            for (int j = 0; j < i; j++) {
                power = (power * 10) % l;
            }
            long term = (digit * power) % l;
            a = (a + term) % l;
            int remainder = (int) a;
            r += m[remainder];
            m[remainder]++;
        }
        System.out.println(r);
    }
}

