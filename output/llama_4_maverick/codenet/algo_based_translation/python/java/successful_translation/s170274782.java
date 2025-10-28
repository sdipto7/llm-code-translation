
import java.util.*;

public class s170274782 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                list.add(scanner.nextInt());
            }
            A.add(list);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> baselis = A.get(0);
            List<Integer> groundlis = A.get(1);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                count += baselis.get(j);
            }
            for (int j = i; j < N; j++) {
                count += groundlis.get(j);
            }
            ans.add(count);
        }
        int max = Collections.max(ans);
        System.out.println(max);
    }
}

