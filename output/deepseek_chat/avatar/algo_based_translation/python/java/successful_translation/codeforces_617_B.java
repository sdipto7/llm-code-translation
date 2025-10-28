
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_617_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine();
        long count = a.chars().filter(ch -> ch == '1').count();
        if (count == 0) {
            System.out.println(0);
        } else {
            String stripped = a.trim().replaceAll("^[0 ]+|[0 ]+$", "");
            String[] parts = stripped.split("1");
            ArrayList<Integer> values = new ArrayList<>();
            for (String part : parts) {
                long zeros = part.chars().filter(ch -> ch == '0').count();
                values.add((int)(zeros + 1));
            }
            long product = 1;
            for (int value : values) {
                product *= value;
            }
            System.out.println(product);
        }
    }
}

