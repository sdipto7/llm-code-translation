
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(inputArray[i]);
        }
        
        long result = 0;
        long mod = 1000000007L;
        
        for (int b = 0; b < 60; b++) {
            long bs = 0;
            long mask = 1L << b;
            for (int i = 0; i < N; i++) {
                if ((A[i] & mask) != 0) {
                    bs++;
                }
            }
            long term = bs * (N - bs) % mod;
            long power = 1L << b;
            result = (result + term * (power % mod)) % mod;
        }
        
        System.out.println(result);
    }
}

