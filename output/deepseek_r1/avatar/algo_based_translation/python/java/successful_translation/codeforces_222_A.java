
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_222_A {

    private static boolean allSame(List<Integer> list) {
        int first = list.get(0);
        for (int num : list) {
            if (num != first) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        
        String[] elements = scanner.nextLine().split(" ");
        List<Integer> elems = new ArrayList<>();
        for (String elem : elements) {
            elems.add(Integer.parseInt(elem));
        }

        if (allSame(elems)) {
            System.out.println(0);
            return;
        }

        if (k == 1) {
            System.out.println(-1);
            return;
        }

        List<Integer> trailing = elems.subList(k - 1, elems.size());
        if (!allSame(trailing)) {
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

