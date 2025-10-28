
import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int s = Integer.parseInt(input[2]);
        int f = Integer.parseInt(input[3]);

        int d;
        String c;
        if (s < f) {
            d = 1;
            c = "R";
        } else {
            d = -1;
            c = "L";
        }

        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        int k = 1;
        int t = 0, l = 0, r = 0;

        if (m > 0) {
            input = scanner.nextLine().split(" ");
            t = Integer.parseInt(input[0]);
            l = Integer.parseInt(input[1]);
            r = Integer.parseInt(input[2]);
            k += 1;
        }

        while (j != f) {
            if (i > t && k <= m) {
                if (scanner.hasNextLine()) {
                    input = scanner.nextLine().split(" ");
                    t = Integer.parseInt(input[0]);
                    l = Integer.parseInt(input[1]);
                    r = Integer.parseInt(input[2]);
                    k += 1;
                }
            }
            if (i == t && (j >= l && j <= r || j + d >= l && j + d <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            i += 1;
        }
        System.out.println(res.toString());
    }
}

