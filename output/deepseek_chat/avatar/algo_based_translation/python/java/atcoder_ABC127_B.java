
import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 2; i <= 11; i++) {
            double constant = D / (1.0 - r);
            double result = Math.pow(r, i - 1) * (x + constant) - constant;
            System.out.println((int) result);
        }
    }
}

