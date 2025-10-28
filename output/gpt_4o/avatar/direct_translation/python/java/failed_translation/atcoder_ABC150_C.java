
import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orig = generatePermutations(n);
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(scanner.nextInt());
        }
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            q.add(scanner.nextInt());
        }
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }

    private static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        permute(nums, 0, result);
        return result;
    }

    private static void permute(List<Integer> nums, int start, List<List<Integer>> result) {
        if (start == nums.size()) {
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++) {
            Collections.swap(nums, start, i);
            permute(nums, start + 1, result);
            Collections.swap(nums, start, i);
        }
    }
}

