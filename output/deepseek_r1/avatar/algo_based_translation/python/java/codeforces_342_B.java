
import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int s = Integer.parseInt(firstLine[2]);
        int f = Integer.parseInt(firstLine[3]);
        
        int d;
        char c;
        if (s < f) {
            d = 1;
            c = 'R';
        } else {
            d = -1;
            c = 'L';
        }
        
        StringBuilder res = new StringBuilder();
        int i = 1;
        int j = s;
        
        String[] stepLine = scanner.nextLine().split(" ");
        int t = Integer.parseInt(stepLine[0]);
        int l = Integer.parseInt(stepLine[1]);
        int r = Integer.parseInt(stepLine[2]);
        int k = 1;
        
        while (j != f) {
            if (i > t && k < m) {
                stepLine = scanner.nextLine().split(" ");
                t = Integer.parseInt(stepLine[0]);
                l = Integer.parseInt(stepLine[1]);
                r = Integer.parseInt(stepLine[2]);
                k++;
            }
            
            if (i == t && ((j >= l && j <= r) || (j + d >= l && j + d <= r))) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            
            i++;
        }
        
        System.out.println(res.toString());
        scanner.close();
    }
}

