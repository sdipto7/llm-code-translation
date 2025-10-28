
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_617_B {
    public static void main(String[] args) {
        System.out.println(calculateProduct());
    }

    public static int calculateProduct() {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        scanner.close();

        a = a.trim();
        if (a.isEmpty() || a.indexOf('1') == -1) {
            return 0;
        }

        String[] parts = a.split("1");
        int[] counts = Arrays.stream(parts)
            .mapToInt(i -> (int) i.chars().filter(ch -> ch == '0').count() + 1)
            .toArray();

        return Arrays.stream(counts).reduce(1, (x, y) -> x * y);
    }
}

