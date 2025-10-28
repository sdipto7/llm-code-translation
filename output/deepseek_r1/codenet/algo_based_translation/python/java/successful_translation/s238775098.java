
import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0.0;
        boolean hasBTC = false;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            String u = scanner.next();
            if (u.equals("BTC")) {
                res += Double.parseDouble(x) * 380000.0;
                hasBTC = true;
            } else {
                res += Integer.parseInt(x);
            }
        }
        if (hasBTC) {
            System.out.println(res);
        } else {
            System.out.println((int) res);
        }
    }
}

