
import java.util.Scanner;

public class s067092519 {
    public static void main(String[] args) {
        int N = readInput();
        int[][][] m = new int[10][3][10];
        readData(N, m);
        printData(m);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void readData(int N, int[][][] m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            int b = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            int v = scanner.nextInt();
            m[b - 1][f - 1][r - 1] += v;
        }
    }

    public static void printData(int[][][] m) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                StringBuilder line = new StringBuilder();
                for (int k = 0; k < 10; k++) {
                    line.append(" ").append(m[i][j][k]);
                }
                System.out.println(line.toString());
            }
            if (i < 3) {
                System.out.println(new String(new char[20]).replace('\0', '#'));
            }
        }
    }
}

