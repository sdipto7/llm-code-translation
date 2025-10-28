
import java.util.Scanner;

public class s331817031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();

        char[][] l = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                l[i][j] = line.charAt(j);
            }
        }

        int tmp = 0;
        outer:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (l[i][j] == '#') {
                    if (j < tmp) {
                        System.out.println("Impossible");
                        break outer;
                    } else {
                        tmp = j;
                    }
                }
            }
        }
        if (!scanner.hasNext()) {
            System.out.println("Possible");
        }
    }
}

