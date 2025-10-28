
import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> orig = permute(n);
        int[] p = readArray(sc, n);
        int[] q = readArray(sc, n);
        int pn = findIndex(orig, p);
        int qn = findIndex(orig, q);
        System.out.println(Math.abs(pn - qn));
    }

    public static List<int[]> permute(int n) {
        List<int[]> result = new ArrayList<>();
        permuteHelper(result, new int[n], 0, n);
        return result;
    }

    private static void permuteHelper(List<int[]> result, int[] current, int index, int n) {
        if (index == n) {
            result.add(current.clone());
        } else {
            for (int i = 1; i <= n; i++) {
                boolean found = false;
                for (int j = 0; j < index; j++) {
                    if (current[j] == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    current[index] = i;
                    permuteHelper(result, current, index + 1, n);
                }
            }
        }
    }

    public static int[] readArray(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int findIndex(List<int[]> list, int[] target) {
        for (int i = 0; i < list.size(); i++) {
            if (Arrays.equals(list.get(i), target)) {
                return i;
            }
        }
        return -1;
    }
}

