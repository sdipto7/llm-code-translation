
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC145_C {
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

    public static void solve(int N, int[] x, int[] y) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(indices, 0, permutations);
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
        double result = 0;
        for (double distance : distances) {
            result += distance;
        }
        result /= distances.size();
        System.out.println(result);
    }

    private static void generatePermutations(List<Integer> list, int start, List<List<Integer>> result) {
        if (start == list.size()) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < list.size(); i++) {
                Collections.swap(list, i, start);
                generatePermutations(list, start + 1, result);
                Collections.swap(list, i, start);
            }
        }
    }
}

