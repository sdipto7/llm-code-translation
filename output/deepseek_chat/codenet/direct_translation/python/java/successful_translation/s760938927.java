
import java.util.Scanner;

public class s760938927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ka = sc.nextInt();
        char[][] mat = new char[h][w];
        for (int i = 0; i < h; i++) {
            mat[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < (1 << (h + w)); i++) {
            String b = String.format("%" + (h + w) + "s", Integer.toBinaryString(i)).replace(' ', '0');
            String rs = b.substring(0, h);
            String cs = b.substring(h);
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

