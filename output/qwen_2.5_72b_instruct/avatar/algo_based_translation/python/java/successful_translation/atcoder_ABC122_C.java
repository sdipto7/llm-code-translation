
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        List<List<Integer>> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> pair = new ArrayList<>();
            pair.add(scanner.nextInt());
            pair.add(scanner.nextInt());
            problems.add(pair);
        }
        scanner.close();

        List<Integer> cumsum = new ArrayList<>();
        cumsum.add(0);
        for (int i = 1; i < n; i++) {
            int total = cumsum.get(i - 1);
            if (s.substring(i - 1, i + 1).equals("AC")) {
                cumsum.add(total + 1);
            } else {
                cumsum.add(total);
            }
        }

        for (List<Integer> pair : problems) {
            int l = pair.get(0);
            int r = pair.get(1);
            System.out.println(cumsum.get(r - 1) - cumsum.get(l - 1));
        }
    }
}

