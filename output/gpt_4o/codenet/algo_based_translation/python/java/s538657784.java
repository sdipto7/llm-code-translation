
import java.util.Scanner;

public class s538657784 {

    public static int calculateResult(int N) {
        int sqN = (int) Math.sqrt(N);
        for (int i = 0; i < sqN; i++) {
            if (N % (sqN - i) == 0) {
                return (int) (N / (sqN - i) + sqN - i) - 2;
            }
        }
        return -1; // Should not reach here if input is valid
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = calculateResult(N);
        System.out.println(result);
        scanner.close();
    }
}

