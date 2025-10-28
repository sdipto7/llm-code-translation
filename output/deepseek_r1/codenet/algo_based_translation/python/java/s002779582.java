
import java.util.Scanner;

public class s002779582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] inputHs = scanner.nextLine().split(" ");
        int[] Hs = new int[inputHs.length];
        for (int i = 0; i < inputHs.length; i++) {
            Hs[i] = Integer.parseInt(inputHs[i]);
        }
        int ans = 0;
        int maxH = 0;
        for (int H : Hs) {
            if (maxH <= H) {
                ans++;
                maxH = H;
            }
        }
        System.out.println(ans);
    }
}

