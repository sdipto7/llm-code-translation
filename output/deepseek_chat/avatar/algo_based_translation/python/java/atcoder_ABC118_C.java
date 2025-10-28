import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] A = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            A[i] = Integer.parseInt(inputArray[i]);
        }
        
        BigInteger gcdResult = BigInteger.valueOf(A[0]);
        for (int i = 1; i < A.length; i++) {
            gcdResult = gcdResult.gcd(BigInteger.valueOf(A[i]));
        }
        
        System.out.println(gcdResult);
    }
}
