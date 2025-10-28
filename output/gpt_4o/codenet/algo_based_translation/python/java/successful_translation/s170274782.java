
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s170274782 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            List<Integer> s = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                s.add(scanner.nextInt());
            }
            A.add(s);
        }

        List<Integer> ans = new ArrayList<>();
        int count;

        for (int i = 0; i < N; i++) {
            List<Integer> baselis = A.get(0);
            List<Integer> groundlis = A.get(1);

            count = 0;
            count += sum(baselis, 0, i + 1);
            count += sum(groundlis, i, N);

            ans.add(count);
        }

        System.out.println(max(ans));
    }

    private static int sum(List<Integer> list, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += list.get(i);
        }
        return total;
    }

    private static int max(List<Integer> list) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

