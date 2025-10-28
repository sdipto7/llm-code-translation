
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] inputArray = scanner.nextLine().split(" ");

        List<int[]> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new int[]{i + 1, Integer.parseInt(inputArray[i])});
        }

        A.sort(Comparator.comparingInt(a -> a[1]));

        List<Integer> A__ = A.stream().map(a -> a[0]).collect(Collectors.toList());

        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(A__.size() - 1));
    }
}

