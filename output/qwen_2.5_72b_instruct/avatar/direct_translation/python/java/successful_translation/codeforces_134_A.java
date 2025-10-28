import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            w.add(scanner.nextInt());
        }
        int x = 0;
        for (int weight : w) {
            x += weight;
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((x - w.get(i)) / (double) (n - 1) == w.get(i)) {
                d.add(i + 1);
            }
        }
        System.out.println(d.size());
        for (int j = 0; j < d.size(); j++) {
            System.out.print(d.get(j));
            if (j < d.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
