
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC145_C {
    public static void solve(int N, List<Integer> x, List<Integer> y) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<List<Integer>> permutations = permutations(indices);
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x.get(t) - x.get(f), 2) + Math.pow(y.get(t) - y.get(f), 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double result = distances.stream().mapToDouble(Double::doubleValue).sum() / distances.size();
        System.out.println(result);
    }

    public static List<List<Integer>> permutations(List<Integer> list) {
        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> result = new ArrayList<>();
        Integer firstElement = list.remove(0);
        List<List<Integer>> recursiveReturn = permutations(list);
        for (List<Integer> li : recursiveReturn) {
            for (int index = 0; index <= li.size(); index++) {
                List<Integer> temp = new ArrayList<>(li);
                temp.add(index, firstElement);
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> x = new ArrayList<>(Collections.nCopies(N, 0));
        List<Integer> y = new ArrayList<>(Collections.nCopies(N, 0));
        for (int i = 0; i < N; i++) {
            x.set(i, scanner.nextInt());
            y.set(i, scanner.nextInt());
        }
        solve(N, x, y);
    }
}

