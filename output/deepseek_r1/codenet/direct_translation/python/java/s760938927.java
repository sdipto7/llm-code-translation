
import java.util.Scanner;

public class s760938927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ka = sc.nextInt();
        char[][] mat = new char[h][];
        for (int i = 0; i < h; i++) {
            mat[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < (1 << (h + w)); i++) {
            int ct = 0;
            for (int l = 0; l < h; l++) {
                for (int k = 0; k < w; k++) {
                    boolean rowOk = (i & (1 << (h + w - 1 - l))) == 0;
                    boolean colOk = (i & (1 << (w - 1 - k))) == 0;
                    if (mat[l][k] == '#' && rowOk && colOk) {
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

