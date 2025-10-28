
import java.util.Scanner;
import java.util.stream.Stream;

public class atcoder_ABC147_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        long[] A = Stream.of(scanner.nextLine().split(" "))
                         .mapToLong(Long::parseLong)
                         .toArray();

        long result = calculateBitwiseSum(N, A);
        System.out.println(result);

        scanner.close();
    }

    public static long calculateBitwiseSum(int N, long[] A) {
        long result = 0;
        final long MOD = 1000000007;

        for (int b = 0; b < 60; b++) {
            long bs = 0;
            for (long num : A) {
                if (((num >> b) & 1) == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1L << b)) % MOD;
        }

        return result;
    }
}

