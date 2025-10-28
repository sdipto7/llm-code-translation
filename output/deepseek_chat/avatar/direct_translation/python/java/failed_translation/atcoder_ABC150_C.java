import java.util.*;
import java.util.stream.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        List<List<Integer>> orig = generatePermutations(list);
        List<Integer> p = Arrays.stream(sc.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> q = Arrays.stream(sc.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }

    private static List<List<Integer>> generatePermutations(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        permute(list, 0, result);
        return result;
    }

    private static void permute(List<Integer> list, int k, List<List<Integer>> result) {
        for (int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permute(list, k + 1, result);
            Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            result.add(new ArrayList<>(list));
        }
    }
}
