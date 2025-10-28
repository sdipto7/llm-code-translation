
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> orig = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            current.add(i);
        }
        orig.add(new ArrayList<>(current));

        while (true) {
            int k = -1;
            for (int i = current.size() - 2; i >= 0; i--) {
                if (current.get(i) < current.get(i + 1)) {
                    k = i;
                    break;
                }
            }
            if (k == -1) break;

            int l = current.size() - 1;
            while (current.get(k) >= current.get(l)) {
                l--;
            }
            Collections.swap(current, k, l);

            int left = k + 1;
            int right = current.size() - 1;
            while (left < right) {
                Collections.swap(current, left, right);
                left++;
                right--;
            }
            orig.add(new ArrayList<>(current));
        }

        List<Integer> p = parsePermutation(scanner.nextLine(), n);
        List<Integer> q = parsePermutation(scanner.nextLine(), n);

        int pn = orig.indexOf(p);
        int qn = orig.indexOf(q);

        System.out.println(Math.abs(pn - qn));
    }

    private static List<Integer> parsePermutation(String line, int n) {
        String[] parts = line.split(" ");
        List<Integer> permutation = new ArrayList<>();
        for (String part : parts) {
            permutation.add(Integer.parseInt(part));
        }
        return permutation;
    }
}

