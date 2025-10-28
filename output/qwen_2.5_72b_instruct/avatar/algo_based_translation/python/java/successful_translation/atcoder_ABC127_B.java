
import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 2; i <= 11; i++) {
            double value = (Math.pow(r, i - 1)) * (x + (double) D / (1 - r)) - (double) D / (1 - r);
            System.out.println((int) value);
        }
    }
}

