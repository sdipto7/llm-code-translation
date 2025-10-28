
import java.util.Scanner;

public class s621701371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int q = scanner.nextInt();
        scanner.nextLine();
        String[][] qs = new String[q][];
        for (int i = 0; i < q; i++) {
            qs[i] = scanner.nextLine().split(" ");
        }
        boolean n = false;
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (String[] operation : qs) {
            if (operation[0].equals("1")) {
                n = !n;
            }
            if (operation[0].equals("2")) {
                int f = Integer.parseInt(operation[1]);
                if (n) {
                    f = f == 1 ? 2 : 1;
                }
                if (f == 1) {
                    left.insert(0, operation[2]);
                } else if (f == 2) {
                    right.append(operation[2]);
                }
            }
        }
        StringBuilder result = new StringBuilder(left.toString() + s + right.toString());
        System.out.println(n ? result.reverse().toString() : result.toString());
    }
}

