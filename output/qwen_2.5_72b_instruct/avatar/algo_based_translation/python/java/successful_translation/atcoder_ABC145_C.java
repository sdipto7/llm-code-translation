import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC145_C {
    public static void solve(int N, List<Integer> x, List<Integer> y) {
        List<Integer> indices = IntStream.range(0, N).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = new ArrayList<>(permute(indices));
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

        double result = distances.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(result);
    }

    private static List<List<Integer>> permute(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (list.size() == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        Integer first = list.get(0);
        List<Integer> sublist = list.subList(1, list.size());
        List<List<Integer>> permutations = permute(sublist);
        for (List<Integer> smallerPermutated : permutations) {
            for (int i = 0; i <= smallerPermutated.size(); i++) {
                List<Integer> temp = new ArrayList<>(smallerPermutated);
                temp.add(i, first);
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = new ArrayList<>();
        while (scanner.hasNext()) {
            tokens.addAll(Arrays.asList(scanner.nextLine().split(" ")));
        }

        int N = Integer.parseInt(tokens.get(0));
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            x.add(Integer.parseInt(tokens.get(1 + 2 * i)));
            y.add(Integer.parseInt(tokens.get(2 + 2 * i)));
        }

        solve(N, x, y);
    }
}
