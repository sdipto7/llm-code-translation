
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class s797394058 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int x = 1;

        List<Integer> N_list = IntStream.range(0, N)
                                         .map(i -> i + 1)
                                         .boxed()
                                         .collect(Collectors.toList());

        List<int[]> n = new ArrayList<>();
        for (int i : N_list) {
            for (int j : N_list) {
                for (int k : N_list) {
                    n.add(new int[]{i, j, k});
                }
            }
        }

        int m = n.size();

        System.out.println(m);
    }
}

