import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nk = readInput(scanner);
        int n = nk[0];
        int k = nk[1];
        List<Integer> elems = readElements(scanner, n);

        if (allSame(elems)) {
            System.out.println(0);
            return;
        }

        if (k == 1) {
            System.out.println(-1);
            return;
        }

        if (!allSame(elems.subList(k - 1, elems.size()))) {
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

    private static int[] readInput(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        return new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1])};
    }

    private static List<Integer> readElements(Scanner scanner, int n) {
        String[] input = scanner.nextLine().split(" ");
        List<Integer> elements = new ArrayList<>();
        for (String s : input) {
            elements.add(Integer.parseInt(s));
        }
        return elements;
    }

    private static boolean allSame(List<Integer> arr) {
        for (int x : arr) {
            if (x != arr.get(0)) {
                return false;
            }
        }
        return true;
    }
}
