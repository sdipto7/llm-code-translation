import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        String n;
        List<String> a = Arrays.asList("10", "100", "1000", "10000", "100000");
        int newSum = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();

        for (char c : n.toCharArray()) {
            newSum += Character.getNumericValue(c);
        }

        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(newSum);
        }
    }
}
