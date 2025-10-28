
import java.util.Scanner;

public class s747093551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int X = Integer.parseInt(inputs[2]);
        int Y = Integer.parseInt(inputs[3]);

        inputs = scanner.nextLine().split(" ");
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(inputs[i]);
        }

        inputs = scanner.nextLine().split(" ");
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            y[i] = Integer.parseInt(inputs[i]);
        }

        System.out.println(checkWar(N, M, X, Y, x, y));
    }

    public static String checkWar(int N, int M, int X, int Y, int[] x, int[] y) {
        int maxX = findMax(x, X);
        int minY = findMin(y, Y);

        return maxX < minY ? "No War" : "War";
    }

    public static int findMax(int[] arr, int val) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return Math.max(max, val);
    }

    public static int findMin(int[] arr, int val) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return Math.min(min, val);
    }
}

