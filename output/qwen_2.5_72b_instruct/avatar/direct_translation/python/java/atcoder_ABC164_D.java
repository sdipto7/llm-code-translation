
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = 2019;
        int[] m = new int[l + 1];
        m[0] = 1;
        int a = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(s.length() - 1 - i);
            a += (e - '0') * (int) Math.pow(10, i % l) % l;
            r += m[a % l];
            m[a % l]++;
        }
        System.out.println(r);
    }
}

