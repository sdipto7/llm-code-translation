
import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String c = scanner.nextLine();
        System.out.println(calculateMinChanges(N, c));
    }

    public static int calculateMinChanges(int N, String c) {
        int num_w = 0;
        for (char ch : c.toCharArray()) {
            if (ch == 'W') num_w++;
        }
        int num_r = N - num_w;
        StringBuilder comp = new StringBuilder();
        for (int i = 0; i < num_r; i++) comp.append('R');
        for (int i = 0; i < num_w; i++) comp.append('W');
        String compStr = comp.toString();
        int ans = 0;
        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != compStr.charAt(i)) ans++;
        }
        return Math.min(ans, Math.min(num_w, num_r));
    }
}

