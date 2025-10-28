
import java.util.Scanner;

public class s331817031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        char[][] grid = new char[h][];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        int tmp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == '#') {
                    if (j < tmp) {
                        System.out.println("Impossible");
                        System.exit(0);
                    } else {
                        tmp = j;
                    }
                }
            }
        }
        System.out.println("Possible");
    }
}

