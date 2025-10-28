
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC119_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<Double> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            s = s.replace("JPY", "*1.0").replace("BTC", "*380000.0");
            String[] parts = s.split("\\*");
            double value = Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
            x.add(value);
        }
        
        double sumX = 0.0;
        for (double num : x) {
            sumX += num;
        }
        
        System.out.println(sumX);
    }
}

