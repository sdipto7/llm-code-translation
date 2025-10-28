
import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input1[0]);
        int at = Integer.parseInt(input1[1]);
        String[] input2 = scanner.nextLine().split(" ");
        int b = Integer.parseInt(input2[0]);
        int bt = Integer.parseInt(input2[1]);
        String[] input3 = scanner.nextLine().split(":");
        int t1 = Integer.parseInt(input3[0]);
        int t2 = Integer.parseInt(input3[1]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans += 1;
            }
            now += b;
        }
        System.out.println(ans);
    }
}

