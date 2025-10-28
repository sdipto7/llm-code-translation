
import java.util.*;

public class atcoder_ABC145_C {
    public static void solve(int N, int[] x, int[] y) {
        Integer[] indices = new Integer[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        List<List<Integer>> permutations = permute(indices);
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double sum = 0;
        for (double distance : distances) {
            sum += distance;
        }
        double average = sum / distances.size();
        System.out.println(average);
    }

    public static List<List<Integer>> permute(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, Integer[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (Integer num : nums) {
                if (!tempList.contains(num)) {
                    tempList.add(num);
                    backtrack(result, tempList, nums);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        solve(N, x, y);
    }
}

