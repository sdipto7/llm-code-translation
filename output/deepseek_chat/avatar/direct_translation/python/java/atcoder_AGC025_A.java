



import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        if (Arrays.asList(a).contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(sum);
        }
    }
}
