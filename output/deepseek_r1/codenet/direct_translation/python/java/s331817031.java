
import java.util.Scanner;

public class s331817031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[h][];
        for (int i = 0; i < h; i++) {
            grid[i] = sc.nextLine().toCharArray();
        }
        int tmp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == '#') {
                    if (j < tmp) {
                        System.out.println("Impossible");
                        return;
                    }
                    tmp = j;
                }
            }
        }
        System.out.println("Possible");
    }
}

