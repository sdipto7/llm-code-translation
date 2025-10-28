import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c = scanner.next();
        int num_w = 0;
        for (char ch : c.toCharArray()) {
            if (ch == 'W') {
                num_w++;
            }
        }
        int num_r = N - num_w;
        StringBuilder comp = new StringBuilder();
        for (int i = 0; i < num_r; i++) {
            comp.append("R");
        }
        for (int i = 0; i < num_w; i++) {
            comp.append("W");
        }
        int ans = 0;
        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }
        ans = Math.min(Math.min(num_w, num_r), ans);
        System.out.println(ans);
        scanner.close();
    }
}
