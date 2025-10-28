
import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().trim().split("\\s+");
        ArrayList<BigInteger> numbers = new ArrayList<>();
        
        for (String val : inputValues) {
            if (!val.isEmpty()) {
                numbers.add(new BigInteger(val));
            }
        }
        
        if (numbers.isEmpty()) {
            throw new RuntimeException("Empty list provided");
        }
        
        BigInteger currentGcd = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            BigInteger nextNum = numbers.get(i);
            if (currentGcd.equals(BigInteger.ZERO) && nextNum.equals(BigInteger.ZERO)) {
                throw new ArithmeticException("gcd(0, 0) undefined");
            }
            currentGcd = currentGcd.gcd(nextNum);
        }
        
        System.out.println(currentGcd);
    }
}

