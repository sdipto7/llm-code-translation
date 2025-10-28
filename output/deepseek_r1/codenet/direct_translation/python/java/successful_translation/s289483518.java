
import java.util.*;

public class s289483518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int[] a = new int[n];
        String[] aStr = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(aStr[i]);
        }

        List<int[]> operations = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" ");
            operations.add(new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])});
        }

        Arrays.sort(a);
        operations.sort((o1, o2) -> Integer.compare(o2[1], o1[1]));

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j >= operations.size()) break;
            if (a[i] < operations.get(j)[1]) {
                a[i] = operations.get(j)[1];
                operations.get(j)[0]--;
                if (operations.get(j)[0] == 0) j++;
            } else break;
        }

        long sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println(sum);
    }
}

