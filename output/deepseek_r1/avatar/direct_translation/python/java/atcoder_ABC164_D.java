
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String reversed = new StringBuilder(s).reverse().toString();
        int[] m = new int[2020];
        m[0] = 1;
        long a = 0;
        long r = 0;
        int pow = 1;
        for (int i = 0; i < reversed.length(); i++) {
            int e = Character.getNumericValue(reversed.charAt(i));
            a = (a + e * pow) % 2019;
            if (a < 0) a += 2019;
            r += m[(int) a];
            m[(int) a]++;
            pow = (pow * 10) % 2019;
        }
        System.out.println(r);
    }
}

