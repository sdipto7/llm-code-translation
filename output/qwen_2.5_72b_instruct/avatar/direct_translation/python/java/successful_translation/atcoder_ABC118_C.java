import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = Arrays.stream(new int[N]).map(i -> scanner.nextInt()).boxed().collect(Collectors.toList());
        int gcd = A.stream().reduce(0, (a, b) -> BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue());
        System.out.println(gcd);
    }
}
