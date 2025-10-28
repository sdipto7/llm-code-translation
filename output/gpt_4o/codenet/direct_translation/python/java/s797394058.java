
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s797394058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;

        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(i + 2);
        }

        List<List<Integer>> n = new ArrayList<>();
        for (int i : N_list) {
            for (int j : N_list) {
                for (int k : N_list) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(i);
                    triplet.add(j);
                    triplet.add(k);
                    n.add(triplet);
                }
            }
        }

        int m = n.size();

        System.out.println(m);
    }
}

