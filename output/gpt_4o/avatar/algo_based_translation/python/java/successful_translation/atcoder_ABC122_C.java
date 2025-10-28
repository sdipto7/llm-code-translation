
import java.util.*;
import java.util.stream.IntStream;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline

        String s = scanner.nextLine();

        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            problems.add(new int[]{l, r});
        }

        int[] cumsum = new int[n];
        cumsum[0] = 0;
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + count(s, i);
        }

        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }

    private static int count(String s, int i) {
        if (i < 1) return 0;
        return s.substring(i - 1, i + 1).equals("AC") ? 1 : 0;
    }
}

