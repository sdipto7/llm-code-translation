
import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double res = 0.0;
        boolean hasBTC = false;
        for (int i = 0; i < n; i++) {
            String xStr = scanner.next();
            String u = scanner.next();
            if (u.equals("BTC")) {
                hasBTC = true;
                res += Double.parseDouble(xStr) * 380000.0;
            } else {
                res += Integer.parseInt(xStr);
            }
        }
        if (hasBTC) {
            System.out.println(res);
        } else {
            System.out.println((long) res);
        }
    }
}

