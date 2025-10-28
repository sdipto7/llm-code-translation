
import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int h = Integer.parseInt(parts[2]);
        int m = Integer.parseInt(parts[3]);
        
        double C = Math.abs(360.0 / 60 * m - 360.0 / 12 * h - 360.0 / (12 * 60) * m);
        if (C > 180) {
            C = 360 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        double result = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
        System.out.println(result);
    }
}

