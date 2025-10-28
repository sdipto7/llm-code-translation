
import java.util.*;
import java.util.stream.*;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nq = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String s = scanner.nextLine();
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int[] problem = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            problems.add(problem);
        }
        
        int[] cumsum = new int[n + 1];
        for (int i = 1; i < n; i++) {
            cumsum[i + 1] = cumsum[i] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r] - cumsum[l]);
        }
    }
}

