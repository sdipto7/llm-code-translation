
import java.util.Scanner;

public class s331817031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] l = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                l[i][j] = line.charAt(j);
            }
        }
        int tmp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (l[i][j] == '#') {
                    if (j < tmp) {
                        System.out.println("Impossible");
                        return;
                    } else {
                        tmp = j;
                    }
                }
            }
        }
        System.out.println("Possible");
    }
}

