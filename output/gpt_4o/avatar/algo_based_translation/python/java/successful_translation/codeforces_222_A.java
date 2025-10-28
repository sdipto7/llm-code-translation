
import java.util.*;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }

        // Step 2: Define a lambda function all_same
        boolean allSame = true;
        for (int i = 1; i < elems.length; i++) {
            if (elems[i] != elems[0]) {
                allSame = false;
                break;
            }
        }

        // Step 3: Check if all elements in elems are the same
        if (allSame) {
            System.out.println(0);
            return;
        }

        // Step 4: Check if k is equal to 1
        if (k == 1) {
            System.out.println(-1);
            return;
        }

        // Step 5: Check if not all elements from index k-1 to end in elems are the same
        for (int i = k - 1; i < elems.length; i++) {
            if (elems[i] != elems[k - 1]) {
                System.out.println(-1);
                return;
            }
        }

        // Step 6: Assign target as the last element of elems
        int target = elems[elems.length - 1];

        // Step 7: Assign to_delete as the slice of elems from start to index k-1
        List<Integer> toDelete = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            toDelete.add(elems[i]);
        }

        // Step 8: While to_delete is not empty and the last element of to_delete equals target
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }

        // Step 9: Output the length of to_delete
        System.out.println(toDelete.size());
    }
}

