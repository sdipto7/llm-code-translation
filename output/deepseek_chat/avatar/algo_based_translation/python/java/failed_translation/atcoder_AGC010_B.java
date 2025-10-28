
import java.util.Scanner;
import java.util.ArrayList;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        
        int totalSum = 0;
        for (int num : a) {
            totalSum += num;
        }
        
        double denominator = n * (n + 1) / 2.0;
        
        if (totalSum % denominator != 0) {
            System.out.println("NO");
        } else {
            double k = totalSum / denominator;
            a.add(a.get(0));
            
            double sum1 = 0;
            int sum2 = 0;
            
            for (int i = 0; i < n; i++) {
                double diff = k - a.get(i + 1) + a.get(i);
                sum1 += diff % n;
                if (diff / n >= 0) {
                    sum2++;
                }
            }
            
            if (sum1 != 0 || sum2 != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}

