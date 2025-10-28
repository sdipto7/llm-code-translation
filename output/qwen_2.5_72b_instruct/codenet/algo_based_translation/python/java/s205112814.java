import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> gate_cond = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            List<Integer> condition = new ArrayList<>();
            condition.add(scanner.nextInt());
            condition.add(scanner.nextInt());
            gate_cond.add(condition);
        }
        
        int max_under_th = Integer.MIN_VALUE;
        int min_upper_th = Integer.MAX_VALUE;
        
        for (List<Integer> condition : gate_cond) {
            if (condition.get(0) > max_under_th) {
                max_under_th = condition.get(0);
            }
            if (condition.get(1) < min_upper_th) {
                min_upper_th = condition.get(1);
            }
        }
        
        if (min_upper_th - max_under_th >= 0) {
            System.out.println(min_upper_th - max_under_th + 1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}
