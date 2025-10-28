
import java.util.*;

public class atcoder_ABC134_E {
    static List<List<Integer>> ans = new ArrayList<>();

    public static int binarySearch(int key) {
        int bad = -1, good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                bad = mid;
            } else {
                good = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(A);
            if (idx == ans.size()) {
                List<Integer> list = new ArrayList<>();
                list.add(A);
                ans.add(list);
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }
}

