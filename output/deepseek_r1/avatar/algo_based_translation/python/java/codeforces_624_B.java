
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputValues = scanner.nextLine().split(" ");
        ArrayList<Integer> a = new ArrayList<>();
        for (String val : inputValues) {
            a.add(Integer.parseInt(val));
        }
        Collections.sort(a, Collections.reverseOrder());
        
        double pre = Double.POSITIVE_INFINITY;
        int ans = 0;
        
        for (int j = 0; j < n; j++) {
            int current = a.get(j);
            double contribution = Math.max(0, Math.min(pre - 1, current));
            ans += (int) contribution;
            pre = contribution;
        }
        
        System.out.println(ans);
    }
}

