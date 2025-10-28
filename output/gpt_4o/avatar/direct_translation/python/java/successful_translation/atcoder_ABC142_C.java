
import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        List<int[]> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new int[]{i + 1, Integer.parseInt(input[i])});
        }
        A.sort(Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i)[0] + " ");
        }
        System.out.println(A.get(A.size() - 1)[0]);
    }
}

