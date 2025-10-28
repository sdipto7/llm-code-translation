
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s491954463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            a.add(a1);
            b.add(b1);
        }

        for (int i = 1; i <= n; i++) {
            int countInA = 0;
            int countInB = 0;

            for (int num : a) {
                if (num == i) {
                    countInA++;
                }
            }

            for (int num : b) {
                if (num == i) {
                    countInB++;
                }
            }

            System.out.println(countInA + countInB);
        }

        scanner.close();
    }
}

