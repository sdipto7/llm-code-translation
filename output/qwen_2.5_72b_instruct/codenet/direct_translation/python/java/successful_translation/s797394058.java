import java.util.ArrayList;
import java.util.List;

public class s797394058 {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        int x = 1;
        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(x + i);
        }
        List<List<Integer>> n = new ArrayList<>();
        cartesianProduct(N_list, new ArrayList<>(), 3, n);
        int m = n.size();
        System.out.println(m);
    }

    private static void cartesianProduct(List<Integer> N_list, List<Integer> current, int depth, List<List<Integer>> result) {
        if (depth == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i : N_list) {
            current.add(i);
            cartesianProduct(N_list, current, depth - 1, result);
            current.remove(current.size() - 1);
        }
    }
}
