
import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        calculateTotalValue();
    }

    public static void calculateTotalValue() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double res = 0.0;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String x = input[0];
            String u = input[1];

            if (u.equals("BTC")) {
                res += Double.parseDouble(x) * 380000;
            } else {
                res += Integer.parseInt(x);
            }
        }

        System.out.println(res);
        scanner.close();
    }
}

