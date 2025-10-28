
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_265_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int ans = n - 1;
        int last = 0;
        for (int i : list) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }
}

