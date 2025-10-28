
import java.util.*;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);
        String[] secondLine = sc.nextLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(secondLine[i]);
        }
        Arrays.sort(a);
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int num : a) {
            if (num > x) {
                x = 0;
                break;
            }
            x -= num;
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}

