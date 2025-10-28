
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        List<int[]> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            problems.add(new int[]{l, r});
        }
        
        BinaryOperator<Integer> count = (total, i) -> {
            if (i >= 1 && i < n && s.substring(i - 1, i + 1).equals("AC")) {
                return total + 1;
            } else {
                return total;
            }
        };
        
        List<Integer> cumsum = new ArrayList<>();
        cumsum.add(0);
        for (int i = 1; i < n; i++) {
            int prev = cumsum.get(i - 1);
            cumsum.add(count.apply(prev, i));
        }
        
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            int result = cumsum.get(r - 1) - cumsum.get(l - 1);
            System.out.println(result);
        }
    }
}

