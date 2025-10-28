
import java.util.Scanner;

public class s067092519 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[][][] m = new int[4][3][10];
        
        for (int i = 0; i < N; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int b = Integer.parseInt(parts[0]);
            int f = Integer.parseInt(parts[1]);
            int r = Integer.parseInt(parts[2]);
            int v = Integer.parseInt(parts[3]);
            m[b-1][f-1][r-1] += v;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                StringBuilder line = new StringBuilder();
                for (int k = 0; k < 10; k++) {
                    line.append(" ").append(m[i][j][k]);
                }
                System.out.println(line.toString());
            }
            if (i < 3) {
                System.out.println("####################");
            }
        }
    }
}

