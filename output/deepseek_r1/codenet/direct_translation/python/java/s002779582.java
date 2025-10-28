
import java.util.Scanner;

public class s002779582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        int[] Hs = new int[N];
        for (int i = 0; i < N; i++) {
            Hs[i] = Integer.parseInt(parts[i]);
        }
        int ans = 0;
        int maxH = 0;
        for (int h : Hs) {
            if (maxH <= h) {
                ans++;
                maxH = h;
            }
        }
        System.out.println(ans);
    }
}

