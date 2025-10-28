
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s554393427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        List<CurrencyData> mo = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            double x = Double.parseDouble(input[0]);
            String u = input[1];
            mo.add(new CurrencyData(x, u));
        }
        double okz = 0;
        for (CurrencyData i : mo) {
            if (i.getUnit().equals("JPY")) {
                okz += i.getAmount();
            } else {
                okz += i.getAmount() * 380000;
            }
        }
        System.out.println(okz);
        scanner.close();
    }
}

class CurrencyData {
    private double amount;
    private String unit;

    public CurrencyData(double amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }
}

