
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC145_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        solve(N, x, y);
    }

    static void solve(int N, List<Integer> x, List<Integer> y) {
        List<List<Integer>> permutations = generatePermutations(N);
        List<Double> distances = new ArrayList<>();

        for (List<Integer> permutation : permutations) {
            double totalDistance = 0.0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double dx = x.get(t) - x.get(f);
                double dy = y.get(t) - y.get(f);
                totalDistance += Math.sqrt(dx * dx + dy * dy);
            }
            distances.add(totalDistance);
        }

        double sum = 0.0;
        for (double d : distances) {
            sum += d;
        }
        System.out.println(sum / distances.size());
    }

    static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = i;
        int[] indexes = new int[n];
        Arrays.fill(indexes, 0);
        addPermutation(result, elements);

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ? 0 : indexes[i], i);
                addPermutation(result, elements);
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
        return result;
    }

    private static void addPermutation(List<List<Integer>> result, int[] elements) {
        List<Integer> permutation = new ArrayList<>();
        for (int element : elements) permutation.add(element);
        result.add(permutation);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

