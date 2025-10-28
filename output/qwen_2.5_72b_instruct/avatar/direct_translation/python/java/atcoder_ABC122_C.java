
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        List<List<Integer>> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> problem = new ArrayList<>();
            problem.add(scanner.nextInt());
            problem.add(scanner.nextInt());
            problems.add(problem);
        }
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        for (List<Integer> problem : problems) {
            int l = problem.get(0);
            int r = problem.get(1);
            System.out.println(cumsum[r] - cumsum[l]);
        }
    }
}

