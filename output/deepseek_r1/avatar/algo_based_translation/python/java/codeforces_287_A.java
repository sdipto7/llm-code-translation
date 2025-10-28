
import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] grid = new char[4][4];
        
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        
        boolean correctFound = false;
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int blackCount = 0;
                int whiteCount = 0;
                
                if (grid[i][j] == '#') blackCount++;
                else whiteCount++;
                
                if (grid[i][j + 1] == '#') blackCount++;
                else whiteCount++;
                
                if (grid[i + 1][j] == '#') blackCount++;
                else whiteCount++;
                
                if (grid[i + 1][j + 1] == '#') blackCount++;
                else whiteCount++;
                
                if (blackCount == 0 || blackCount == 3 || blackCount == 4 || whiteCount == 0 || whiteCount == 3 || whiteCount == 4) {
                    correctFound = true;
                    break outerLoop;
                }
            }
        }
        
        System.out.println(correctFound ? "YES" : "NO");
        scanner.close();
    }
}

