
import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder t = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t.append('A');
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
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
        String tStr = t.toString();
        int total = 0;
        int numA = 0;
        for (int j = 0; j < tStr.length(); j++) {
            char c = tStr.charAt(j);
            if (c == 'X') {
                numA = 0;
            } else {
                if (c == 'A') {
                    numA++;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
    }
}

