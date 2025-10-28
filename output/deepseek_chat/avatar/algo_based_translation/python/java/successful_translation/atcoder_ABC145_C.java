
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC145_C {
    
    public static void solve(int N, List<Integer> x, List<Integer> y) {
        List<Integer> indices = IntStream.range(0, N).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = generatePermutations(indices);
        List<Double> distances = new ArrayList<>();
        
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0.0;
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
    
    private static List<List<Integer>> generatePermutations(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        permute(list, 0, result);
        return result;
    }
    
    private static void permute(List<Integer> list, int k, List<List<Integer>> result) {
        if (k == list.size()) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = k; i < list.size(); i++) {
                Collections.swap(list, k, i);
                permute(list, k + 1, result);
                Collections.swap(list, k, i);
            }
        }
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
        scanner.close();
    }
}

