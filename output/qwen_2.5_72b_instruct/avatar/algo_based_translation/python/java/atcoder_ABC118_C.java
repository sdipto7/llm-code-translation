
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = IntStream.range(0, N)
                                   .map(i -> scanner.nextInt())
                                   .boxed()
                                   .collect(Collectors.toList());
        int gcd = A.stream()
                   .reduce(GCDCalculator::gcd)
                   .orElse(0);
        System.out.println(gcd);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

