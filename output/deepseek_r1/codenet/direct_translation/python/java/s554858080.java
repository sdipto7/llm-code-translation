
import java.util.Scanner;
import java.math.BigInteger;

public class s554858080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split("\\s+");
        String numStr = String.join("", parts);
        BigInteger num = new BigInteger(numStr);
        System.out.println(num.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO) ? "YES" : "NO");
    }
}

