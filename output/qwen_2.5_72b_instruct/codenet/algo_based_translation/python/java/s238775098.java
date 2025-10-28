import java.util.Scanner;

public class s238775098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        float res = 0.0f;
        for (int _ = 0; _ < n; _++) {
            String[] inputParts = scanner.nextLine().split(" ");
            String x = inputParts[0];
            String u = inputParts[1];
            if (u.equals("BTC")) {
                res += Float.parseFloat(x) * 380000;
            } else {
                res += Integer.parseInt(x);
            }
        }
        System.out.println(res);
        scanner.close();
    }
}
