
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class s538657784 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sqN = (int) sqrt(N);
        
        for (int i = 0; i < sqN; i++) {
            int divisor = sqN - i;
            if (N % divisor == 0) {
                int result = (N / divisor + divisor) - 2;
                System.out.println(result);
                break;
            }
        }
        scanner.close();
    }
}

