
import java.util.*;

public class s289483518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Arrays.sort(a);
        
        int[][] ope = new int[m][2];
        for (int i = 0; i < m; i++) {
            ope[i][0] = scanner.nextInt();
            ope[i][1] = scanner.nextInt();
            scanner.nextLine();
        }
        
        Arrays.sort(ope, (x, y) -> Integer.compare(y[1], x[1]));
        
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < ope[j][1]) {
                a[i] = ope[j][1];
                ope[j][0]--;
                if (ope[j][0] == 0) {
                    j++;
                    if (j == ope.length) {
                        break;
                    }
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

