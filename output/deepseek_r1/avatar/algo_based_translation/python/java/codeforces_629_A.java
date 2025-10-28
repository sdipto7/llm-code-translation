
import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] cake = new String[n];
        
        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
        }
        
        int happiness = 0;
        
        // Process rows
        for (int i = 0; i < n; i++) {
            String row = cake[i];
            int chocCount = 0;
            for (int j = 0; j < n; j++) {
                if (row.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                int nfat = 1;
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
        }
        
        // Process columns
        for (int j = 0; j < n; j++) {
            int chocCount = 0;
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                int nfat = 1;
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
        }
        
        System.out.println(happiness);
    }
}

