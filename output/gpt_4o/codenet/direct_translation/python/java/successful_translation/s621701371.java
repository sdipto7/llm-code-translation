
import java.util.*;

public class s621701371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int q = Integer.parseInt(scanner.nextLine());
        List<String[]> qs = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            qs.add(scanner.nextLine().split(" "));
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
                String c = operation[2];
                if (n) {
                    f = f != 1 ? 1 : 2;
                }
                if (f == 1) {
                    left.insert(0, c);
                } else if (f == 2) {
                    right.append(c);
                }
            }
        }
        s = left.toString() + s + right.toString();
        if (n) {
            s = new StringBuilder(s).reverse().toString();
        }
        System.out.println(s);
    }
}

