import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        int a = Integer.parseInt(line1[0]);
        int at = Integer.parseInt(line1[1]);
        String[] line2 = sc.nextLine().split(" ");
        int b = Integer.parseInt(line2[0]);
        int bt = Integer.parseInt(line2[1]);
        String[] time = sc.nextLine().split(":");
        int t1 = Integer.parseInt(time[0]);
        int t2 = Integer.parseInt(time[1]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        System.out.println(ans);
    }
}
