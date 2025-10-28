
import java.util.*;

public class atcoder_AGC012_A {
    public static final int mod = 1000000007;

    public static List<Integer> readInts() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String s : input) {
            integers.add(Integer.parseInt(s));
        }
        return integers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> A = readInts();

        Collections.sort(A);

        int ans = 0;
        for (int i = A.size() - 2; i >= A.size() - 2 * n; i -= 2) {
            ans += A.get(i);
        }

        System.out.println(ans);
    }
}

