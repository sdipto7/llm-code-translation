
import java.util.*;

public class s289483518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        List<int[]> ope = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int count = scanner.nextInt();
            int value = scanner.nextInt();
            ope.add(new int[]{count, value});
        }
        Collections.sort(ope, (x, y) -> Integer.compare(y[1], x[1]));
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j >= ope.size()) break;
            if (a[i] < ope.get(j)[1]) {
                a[i] = ope.get(j)[1];
                ope.get(j)[0]--;
                if (ope.get(j)[0] == 0) {
                    j++;
                    if (j == ope.size()) break;
                }
            } else {
                break;
            }
        }
        long sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println(sum);
    }
}

