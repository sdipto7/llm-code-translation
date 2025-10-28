
import java.util.*;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        Integer[] indices = new Integer[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        List<List<Integer>> permutations = permute(indices);
        double sum = 0;
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            sum += totalDistance;
        }
        double result = sum / permutations.size();
        System.out.println(result);
    }

    public static List<List<Integer>> permute(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, 0, result);
        return result;
    }

    private static void permuteHelper(Integer[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            result.add(Arrays.asList(Arrays.copyOf(nums, nums.length)));
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                permuteHelper(nums, start + 1, result);
                swap(nums, start, i);
            }
        }
    }

    private static void swap(Integer[] nums, int i, int j) {
        Integer temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

