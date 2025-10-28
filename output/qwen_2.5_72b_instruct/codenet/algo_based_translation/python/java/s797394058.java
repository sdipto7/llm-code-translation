import java.util.*;
import java.util.stream.*;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;
        List<Integer> N_list = IntStream.range(2, N + 2).boxed().collect(Collectors.toList());
        List<List<Integer>> n = new ArrayList<>();
        for (int a : N_list) {
            for (int b : N_list) {
                for (int c : N_list) {
                    n.add(Arrays.asList(a, b, c));
                }
            }
        }
        int m = n.size();
        System.out.println(m);
    }
}
