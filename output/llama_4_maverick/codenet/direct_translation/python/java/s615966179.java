
import java.util.Scanner;
public class s615966179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int a = Integer.parseInt(str[1]);
        int b = Integer.parseInt(str[2]);
        int ans = n / (a + b) * a;
        int r = Math.min(n % (a + b), a);
        ans += r;
        System.out.println(ans);
    }
}

