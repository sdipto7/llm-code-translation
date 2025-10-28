
import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += c - '0';
        }
        boolean found = false;
        for (String s : a) {
            if (s.equals(n)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(10);
        } else {
            System.out.println(sum);
        }
    }
}

