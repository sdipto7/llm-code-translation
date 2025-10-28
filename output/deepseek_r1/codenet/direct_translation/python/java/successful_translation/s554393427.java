
import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        double total = 0.0;
        for (int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().split(" ");
            double value = Double.parseDouble(parts[0]);
            String currency = parts[1];
            if (currency.equals("JPY")) {
                total += value;
            } else {
                total += value * 380000.0;
            }
        }
        System.out.println(total);
        scanner.close();
    }
}

