import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Pair> A = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int value = scanner.nextInt();
            A.add(new Pair(i, value));
        }
        List<Pair> A_ = A.stream()
                         .sorted(Comparator.comparingInt(pair -> pair.value))
                         .collect(Collectors.toList());
        List<Integer> A__ = A_.stream()
                               .map(pair -> pair.index)
                               .collect(Collectors.toList());
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(A__.size() - 1));
    }
}

class Pair {
    int index;
    int value;

    Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
