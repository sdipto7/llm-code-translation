
import java.util.Scanner;

public class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        
        for (int i = 2; i <= 11; i++) {
            int exponent = i - 1;
            double term1 = Math.pow(r, exponent);
            double denominator = 1 - r;
            double term2 = (double) D / denominator;
            double term3 = x + term2;
            int result = (int) (term1 * term3 - term2);
            System.out.println(result);
        }
    }
}

