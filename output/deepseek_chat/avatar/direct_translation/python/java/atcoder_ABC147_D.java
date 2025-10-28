import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        long[] A = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long result = 0;
        for (int b = 0; b < 60; b++) {
            long bs = Arrays.stream(A).map(x -> (x >> b) & 1).sum();
            result = (result + bs * (N - bs) * (1L << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
