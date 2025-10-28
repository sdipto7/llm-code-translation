
public class atcoder_AGC034_B {
    public static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while (max % min > 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return min;
    }

    public static void solve() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.next();
        StringBuilder t = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t.append('A');
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
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
            } else {
                t.append('X');
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        for (i = 0; i < t.length(); i++) {
            if (t.charAt(i) == 'X') {
                numA = 0;
            } else {
                if (t.charAt(i) == 'A') {
                    numA++;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        solve();
    }
}

