
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_354_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        List<Integer> W = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            W.add(scanner.nextInt());
        }
        List<Integer> sum_el = new ArrayList<>();
        sum_el.add(0);
        for (int i = 1; i <= n; i++) {
            sum_el.add(W.get(i - 1) + sum_el.get(i - 1));
        }
        int answer = QR * (n - 1) + sum_el.get(n) * R;
        for (int i = 1; i <= n; i++) {
            int energy = L * sum_el.get(i) + R * (sum_el.get(n) - sum_el.get(i));
            if (i > (n - i)) {
                energy = energy + (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy = energy + ((n - i) - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
        scanner.close();
    }
}

