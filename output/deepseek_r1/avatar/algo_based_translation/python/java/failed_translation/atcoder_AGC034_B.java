
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static int gcd(int a, int b) {
        int temp = Math.max(a, b);
        b = Math.min(a, b);
        a = temp;
        while (a % b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder t = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            char current = s.charAt(i);
            if (current == 'A') {
                t.append('A');
                i++;
            } else if (current == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t.append('D');
                    i += 2;
                } else {
                    t.append('X');
                    i++;
                }
            } else {
                t.append('X');
                i++;
            }
        }
        
        int total = 0;
        int numA = 0;
        String processed = t.toString();
        for (int j = 0; j < processed.length(); j++) {
            char c = processed.charAt(j);
            if (c == 'X') {
                numA = 0;
            } else if (c == 'A') {
                numA++;
            } else {
                total += numA;
            }
        }
        
        System.out.println(total);
        scanner.close();
    }

    public static void main(String[] args) {
        solve();
    }
}

