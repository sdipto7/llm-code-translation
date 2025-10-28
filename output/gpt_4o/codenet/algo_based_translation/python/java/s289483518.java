
import java.util.*;

public class s289483518 {

    public static int processNumbers(int n, int m, List<Integer> a, List<int[]> operations) {
        // Sort list `a` in ascending order
        Collections.sort(a);

        // Sort operations based on the second element of each tuple in descending order
        operations.sort((o1, o2) -> Integer.compare(o2[1], o1[1]));

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < operations.size() && a.get(i) < operations.get(j)[1]) {
                a.set(i, operations.get(j)[1]);
                operations.get(j)[0]--;
                if (operations.get(j)[0] == 0) {
                    j++;
                }
            } else {
                break;
            }
        }

        // Calculate the sum of list `a`
        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Read list a
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        
        // Read operations
        List<int[]> operations = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            operations.add(new int[]{b, c});
        }
        
        scanner.close();
        
        // Process numbers and print the result
        int result = processNumbers(n, m, a, operations);
        System.out.println(result);
    }
}

