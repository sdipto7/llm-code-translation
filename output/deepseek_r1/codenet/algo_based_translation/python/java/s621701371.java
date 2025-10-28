
import java.util.*;

public class s621701371 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int q = scanner.nextInt();
        scanner.nextLine();
        List<String[]> qs = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            qs.add(scanner.nextLine().split(" "));
        }
        boolean n = false;
        String left = "";
        String right = "";
        for (String[] op : qs) {
            if (op[0].equals("1")) {
                n = !n;
            } else if (op[0].equals("2")) {
                int f = Integer.parseInt(op[1]);
                String c = op[2];
                if (n) {
                    f = (f == 1) ? 2 : 1;
                }
                if (f == 1) {
                    left = c + left;
                } else if (f == 2) {
                    right += c;
                }
            }
        }
        String result = left + s + right;
        if (n) {
            result = new StringBuilder(result).reverse().toString();
        }
        System.out.println(result);
    }
}

