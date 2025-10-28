import java.util.Scanner;

public class s663509070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] mat = new int[N][D];
        for (int d = 0; d < N; d++) {
            for (int j = 0; j < D; j++) {
                mat[d][j] = scanner.nextInt();
            }
        }
        int c = 0;
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                double dist = Math.sqrt(sumOfSquaredDifferences(mat[i], mat[j]));
                if (dist == (int) dist) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    private static int sumOfSquaredDifferences(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return sum;
    }
}
