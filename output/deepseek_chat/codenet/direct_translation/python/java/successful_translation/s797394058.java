
import java.util.*;

public class s797394058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;
        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(i + 2);
        }
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

