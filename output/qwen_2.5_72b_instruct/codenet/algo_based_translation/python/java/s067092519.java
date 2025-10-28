
import java.util.Scanner;

public class s067092519 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][][] m = new int[10][3][10];
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < N; i++) {
            String[] n = scanner.nextLine().split(" ");
            int b = Integer.parseInt(n[0]);
            int f = Integer.parseInt(n[1]);
            int r = Integer.parseInt(n[2]);
            int v = Integer.parseInt(n[3]);
            m[b - 1][f - 1][r - 1] += v;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                String line = "";
                for (int k = 0; k < 10; k++) {
                    line += " " + m[i][j][k];
                }
                System.out.println(line);
            }
            if (i < 3) {
                System.out.println("####################");
            }
        }
    }
}

