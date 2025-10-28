
import java.util.Scanner;
import java.util.ArrayList;

public class s491954463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] ab = scanner.nextLine().split(" ");
            int a1 = Integer.parseInt(ab[0]);
            int b1 = Integer.parseInt(ab[1]);
            a.add(a1);
            b.add(b1);
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;
            count += countOccurrences(a, i);
            count += countOccurrences(b, i);
            System.out.println(count);
        }
        scanner.close();
    }

    private static int countOccurrences(ArrayList<Integer> list, int target) {
        int count = 0;
        for (int num : list) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}

