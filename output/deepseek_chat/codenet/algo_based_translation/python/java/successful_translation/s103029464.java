
import java.util.Scanner;
import java.util.ArrayList;

public class s103029464 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        int[] B = new int[N];
        
        int i = N - 1;
        while (i >= 0) {
            int tmpSum = 0;
            int j = (i + 1) * 2 - 1;
            while (j < N) {
                tmpSum += B[j];
                tmpSum %= 2;
                j += i + 1;
            }
            B[i] = tmpSum ^ A[i];
            i--;
        }
        
        int totalSum = 0;
        for (int value : B) {
            totalSum += value;
        }
        
        ArrayList<Integer> indices = new ArrayList<>();
        for (int idx = 0; idx < B.length; idx++) {
            if (B[idx] == 1) {
                indices.add(idx + 1);
            }
        }
        
        System.out.println(totalSum);
        for (int k = 0; k < indices.size(); k++) {
            if (k > 0) {
                System.out.print(" ");
            }
            System.out.print(indices.get(k));
        }
        System.out.println();
    }
}

