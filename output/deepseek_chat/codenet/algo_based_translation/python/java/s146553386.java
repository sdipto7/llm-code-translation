
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class s146553386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String[] line = scanner.nextLine().split(" ");
            List<Integer> row = new ArrayList<>();
            for (String num : line) {
                row.add(Integer.parseInt(num));
            }
            a.add(row);
        }
        
        Collections.reverse(a.get(1));
        
        int[] res0 = new int[n];
        int[] res1 = new int[n];
        
        int sum0 = 0;
        for (int i = 0; i < n; i++) {
            sum0 += a.get(0).get(i);
            res0[i] = sum0;
        }
        
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a.get(1).get(i);
            res1[i] = sum1;
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res0[i] + res1[n - 1 - i];
            if (check > ans) {
                ans = check;
            }
        }
        
        System.out.println(ans);
    }
}

