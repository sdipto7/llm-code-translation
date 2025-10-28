
import java.util.Scanner;

public class s663509070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] mat = new int[N][D];
        
        for (int d = 0; d < N; d++) {
            for (int k = 0; k < D; k++) {
                mat[d][k] = scanner.nextInt();
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
    
    private static double sumOfSquaredDifferences(int[] array1, int[] array2) {
        double sum = 0;
        for (int k = 0; k < array1.length; k++) {
            sum += Math.pow(array1[k] - array2[k], 2);
        }
        return sum;
    }
}

