
import java.util.Scanner;

public class s353603279 {
    public static void main(String[] args) {
        System.out.println(calculate_result());
    }

    public static int calculate_result() {
        int X, h, a, y;
        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();
        scanner.close();
        h = X / 500;
        a = (X % 500) / 5;
        y = h * 1000 + a * 5;
        return y;
    }
}

