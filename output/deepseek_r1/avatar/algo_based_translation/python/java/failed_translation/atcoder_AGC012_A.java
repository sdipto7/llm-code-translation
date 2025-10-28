
import java.util.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        ArrayList<Integer> A = new ArrayList<>();
        for (String s : inputArray) {
            A.add(Integer.parseInt(s));
        }
        Collections.sort(A);
        int ans = 0;
        int startIndex = A.size() - 2;
        int endIndex = A.size() - 2 * n - 1;
        for (int i = startIndex; i > endIndex; i -= 2) {
            ans += A.get(i);
        }
        System.out.println(ans);
    }
}

