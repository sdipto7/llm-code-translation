import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s609392609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            int s = 0;
            for (int j = 0; j < t.size(); j++) {
                if (j == p - 1) {
                    s += x;
                } else {
                    s += t.get(j);
                }
            }
            System.out.println(s);
        }
        scanner.close();
    }
}
