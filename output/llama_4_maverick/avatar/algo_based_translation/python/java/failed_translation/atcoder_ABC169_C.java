
import java.util.Scanner;
import java.math.BigDecimal;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        BigDecimal sb = new BigDecimal(inputs[1]);
        BigDecimal hundred = new BigDecimal("100");
        BigDecimal bDecimal = sb.multiply(hundred);
        bDecimal = bDecimal.add(new BigDecimal("0.1"));
        int b = bDecimal.intValue();
        System.out.println((long)a * b / 100);
    }
}

