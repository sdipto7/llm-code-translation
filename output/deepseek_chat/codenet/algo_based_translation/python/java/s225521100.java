
import java.util.Scanner;
import java.util.ArrayList;

public class s225521100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            A.add(0);
        }
        
        for (int i = 0; i < K; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> AA = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                AA.add(scanner.nextInt());
            }
            for (int j = 0; j < d; j++) {
                int index = AA.get(j) - 1;
                A.set(index, 1);
            }
        }
        
        int n = 0;
        for (int i = 0; i < N; i++) {
            if (A.get(i) == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}

