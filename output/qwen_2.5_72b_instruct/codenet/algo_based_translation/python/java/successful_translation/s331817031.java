
import java.util.Scanner;

public class s331817031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.nextLine();
        
        String[][] l = new String[h][w];
        
        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                l[i][j] = String.valueOf(line.charAt(j));
            }
        }
        
        int tmp = 0;
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (l[i][j].equals("#")) {
                    if (j < tmp) {
                        System.out.println("Impossible");
                        return;
                    } else {
                        tmp = j;
                    }
                }
            }
        }
        
        System.out.println("Possible");
    }
}

