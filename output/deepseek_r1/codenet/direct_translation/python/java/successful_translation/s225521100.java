
import java.util.Scanner;

public class s225521100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int num = scanner.nextInt();
                A[num - 1] = 1;
            }
        }
        
        int count = 0;
        for (int value : A) {
            if (value == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

