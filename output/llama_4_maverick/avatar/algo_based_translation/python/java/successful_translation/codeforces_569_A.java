
import java.util.Scanner;

public class codeforces_569_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int t = Integer.parseInt(inputs[0]);
        int s = Integer.parseInt(inputs[1]);
        int q = Integer.parseInt(inputs[2]);
        int ans = 0;
        while (s < t) {
            s *= q;
            ans += 1;
        }
        System.out.println(ans);
    }
}

