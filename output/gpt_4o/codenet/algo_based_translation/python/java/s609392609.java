
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s609392609 {

    public static List<Integer> calculateModifiedSums(int n, List<Integer> t, int m, List<int[]> operations) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int p = operations.get(i)[0];
            int x = operations.get(i)[1];
            int s = 0;
            
            for (int j = 0; j < t.size(); j++) {
                if (j == p - 1) {
                    s += x;
                } else {
                    s += t.get(j);
                }
            }
            result.add(s);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> t = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            t.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        List<int[]> operations = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            operations.add(new int[]{p, x});
        }

        List<Integer> result = calculateModifiedSums(n, t, m, operations);

        for (int sum : result) {
            System.out.println(sum);
        }

        scanner.close();
    }
}

