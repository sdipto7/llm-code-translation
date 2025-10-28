import java.util.*;
public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orig = new ArrayList<>();
        generatePermutations(new ArrayList<>(), n, orig);
        List<Integer> p = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> q = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);
        System.out.println(Math.abs(pn - qn));
    }

    private static void generatePermutations(List<Integer> current, int n, List<List<Integer>> orig) {
        if (current.size() == n) {
            orig.add(new ArrayList<>(current));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!current.contains(i)) {
                current.add(i);
                generatePermutations(current, n, orig);
                current.remove(current.size() - 1);
            }
        }
    }
}
