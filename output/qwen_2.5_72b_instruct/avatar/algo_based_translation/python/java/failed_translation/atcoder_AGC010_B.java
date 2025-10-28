import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        if (sum(a) % (n * (n + 1) / 2.0) != 0) {
            System.out.println("NO");
        } else {
            double k = sum(a) / (n * (n + 1) / 2.0);
            a.add(a.get(0));
            List<Double> temp = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                double value = (k - a.get(i) + a.get(i - 1)) % n;
                temp.add(value);
            }
            if (sum(temp) != 0) {
                System.out.println("NO");
            } else {
                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if ((k - a.get(i) + a.get(i - 1)) / n >= 0) {
                        count++;
                    }
                }
                if (count != n) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }

    private static double sum(List<Double> list) {
        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        return sum;
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
