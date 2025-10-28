
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s002779582 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> Hs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Hs.add(scanner.nextInt());
        }
        scanner.close();
        
        int result = countVisibleMountains(N, Hs);
        System.out.println(result);
    }

    public static int countVisibleMountains(int N, List<Integer> Hs) {
        int ans = 0;
        int maxH = 0;

        for (int H : Hs) {
            if (maxH <= H) {
                ans++;
                maxH = H;
            }
        }

        return ans;
    }
}

