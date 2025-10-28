import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> elems = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        boolean allSame = elems.stream().allMatch(x -> x.equals(elems.get(0)));
        if (allSame) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!elems.subList(k - 1, elems.size()).stream().allMatch(x -> x.equals(elems.get(k - 1)))) {
            System.out.println(-1);
            return;
        }
        int target = elems.get(elems.size() - 1);
        List<Integer> toDelete = new ArrayList<>(elems.subList(0, k - 1));
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }
        System.out.println(toDelete.size());
    }
}
