
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            l.add(num);
        }
        int ans = n - 1;
        int last = 0;
        for (int i : l) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }
}

