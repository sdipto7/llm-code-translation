
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> cake = new ArrayList<>();
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            cake.add(line);
            
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            
            nfat = 1;
            chocCount = 0;
        }
        
        int posCount = 0;
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake.get(i).charAt(j) == 'C') {
                    chocCount++;
                }
            }
            
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            
            nfat = 1;
            chocCount = 0;
        }
        
        System.out.println(happiness);
        scanner.close();
    }
}

