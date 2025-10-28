
import java.util.Scanner;

public class s760938927 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int ka = scanner.nextInt();
        scanner.nextLine();
        char[][] mat = new char[h][];
        for (int i = 0; i < h; i++) {
            mat[i] = scanner.nextLine().toCharArray();
        }
        int ans = 0;
        int totalBits = h + w;
        for (int i = 0; i < (1 << totalBits); i++) {
            String binary = String.format("%" + totalBits + "s", Integer.toBinaryString(i)).replace(' ', '0');
            String rs = binary.substring(0, h);
            String cs = binary.substring(h);
            int ct = 0;
            for (int l = 0; l < h; l++) {
                for (int k = 0; k < w; k++) {
                    if (mat[l][k] == '#' && rs.charAt(l) == '0' && cs.charAt(k) == '0') {
                        ct++;
                    }
                }
            }
            if (ct == ka) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

