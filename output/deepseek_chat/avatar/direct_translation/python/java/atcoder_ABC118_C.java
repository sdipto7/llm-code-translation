
import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = Arrays.stream(sc.nextLine().trim().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        BigInteger gcd = A.stream()
                          .map(BigInteger::valueOf)
                          .reduce(Main::gcd)
                          .orElse(BigInteger.ZERO);
        System.out.println(gcd);
    }

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }
}

