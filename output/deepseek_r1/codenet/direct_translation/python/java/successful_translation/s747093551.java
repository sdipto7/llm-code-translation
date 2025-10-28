
import java.util.Scanner;

public class s747093551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int X = Integer.parseInt(firstLine[2]);
        int Y = Integer.parseInt(firstLine[3]);

        String[] xStr = sc.nextLine().split(" ");
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(xStr[i]);
        }

        String[] yStr = sc.nextLine().split(" ");
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            y[i] = Integer.parseInt(yStr[i]);
        }

        int maxX = X;
        for (int num : x) {
            if (num > maxX) {
                maxX = num;
            }
        }

        int minY = Y;
        for (int num : y) {
            if (num < minY) {
                minY = num;
            }
        }

        System.out.println(maxX < minY ? "No War" : "War");
    }
}

