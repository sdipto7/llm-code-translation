
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_596_B {

    public static int calculateSumOfAbsoluteDifferences(int n, List<Integer> r) {
        int ans = Math.abs(r.get(0));
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r.get(i) - r.get(i - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        String[] rString = scanner.nextLine().split(" ");
        List<Integer> r = new ArrayList<>();
        for (String numStr : rString) {
            r.add(Integer.parseInt(numStr));
        }
        
        int result = calculateSumOfAbsoluteDifferences(n, r);
        System.out.println(result);
        
        scanner.close();
    }
}

