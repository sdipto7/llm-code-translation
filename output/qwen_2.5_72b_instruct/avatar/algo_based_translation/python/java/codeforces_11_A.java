import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        List<Integer> x = new ArrayList<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            x.add(Integer.parseInt(number));
        }
        int m = 0;
        int q = 0;
        for (int a = 0; a < x.size() - 1; a++) {
            if (x.get(a) >= x.get(a + 1)) {
                q = ((x.get(a) - x.get(a + 1)) / d) + 1;
                m += q;
                x.set(a + 1, x.get(a + 1) + q * d);
            }
        }
        System.out.println(m);
    }
}
