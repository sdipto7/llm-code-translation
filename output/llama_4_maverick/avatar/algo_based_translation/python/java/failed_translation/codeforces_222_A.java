
import java.util.Scanner;

public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        String[] line2 = scanner.nextLine().split(" ");
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = Integer.parseInt(line2[i]);
        }
        if (allSame(elems)) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(Arrays.copyOfRange(elems, k - 1, n))) {
            System.out.println(-1);
            return;
        }
        int target = elems[n - 1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, k - 1);
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    public static boolean allSame(int[] arr) {
        int first = arr[0];
        for (int i : arr) {
            if (i != first) {
                return false;
            }
        }
        return true;
    }
}

