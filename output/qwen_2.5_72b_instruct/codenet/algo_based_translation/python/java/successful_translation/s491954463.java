
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
            int countA = countOccurrences(a, i);
            int countB = countOccurrences(b, i);
            System.out.println(countA + countB);
        }
    }

    private static int countOccurrences(List<Integer> list, int value) {
        int count = 0;
        for (int num : list) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }
}

