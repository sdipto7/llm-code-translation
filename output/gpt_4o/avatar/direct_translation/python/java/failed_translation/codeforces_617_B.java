
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine();
        
        if (a.chars().filter(c -> c == '1').count() == 0) {
            System.out.println(0);
        } else {
            String[] parts = a.trim().replaceAll("^0+|0+$", "").split("1");
            int product = Arrays.stream(parts)
                                .mapToInt(i -> i.length() + 1)
                                .reduce(1, (x, y) -> x * y);
            System.out.println(product);
        }
    }
}

