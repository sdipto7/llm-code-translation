import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new int[]{i + 1, scanner.nextInt()});
        }
        List<int[]> A_ = A.stream().sorted(Comparator.comparingInt(a -> a[1])).collect(Collectors.toList());
        List<Integer> A__ = A_.stream().map(a -> a[0]).collect(Collectors.toList());
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(A__.size() - 1));
    }
}
