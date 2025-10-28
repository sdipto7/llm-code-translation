
import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        double res = calculateTotal(n, scanner);
        System.out.println(res);
    }

    public static double calculateTotal(int n, Scanner scanner) {
        double res = 0;
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
        return res;
    }
}

