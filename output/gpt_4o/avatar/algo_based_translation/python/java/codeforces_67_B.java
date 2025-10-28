
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_67_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline
        
        List<Integer> M = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            M.add(scanner.nextInt());
        }

        int m = 0;
        
        for (int j = 0; j < n; j++) {
            int p = 0;
            for (p = 0; p < n; p++) {
                if (M.get(p) == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            
            for (int l = 0; l < p + 1 - k; l++) {
                M.set(l, M.get(l) - 1);
            }
            
            M.set(p, M.get(p) - 1);
        }
        
        scanner.close();
    }
}

