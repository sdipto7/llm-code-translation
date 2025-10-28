import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_327_A {
    public static List<Integer> find(String s, char ch) {
        return IntStream.range(0, s.length())
                        .filter(i -> s.charAt(i) == ch)
                        .boxed()
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next().replace(" ", "");
        if (!s.contains("0")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = find(s, '0');
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                List<int[]> combs = new ArrayList<>();
                for (int i = 0; i < indices.size(); i++) {
                    for (int j = i + 1; j < indices.size(); j++) {
                        combs.add(new int[]{indices.get(i), indices.get(j)});
                    }
                }
                for (int[] x : combs) {
                    maximum = Math.max(maximum, 2 + 2 * (Math.abs(indices.indexOf(x[0]) - indices.indexOf(x[1])) - 1) - (Math.abs(x[0] - x[1]) - 1));
                }
                System.out.println(s.chars().filter(c -> c == '1').count() + maximum);
            }
        }
    }
}
