
import java.util.Scanner;

public class codeforces_342_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();
        int f = input.nextInt();
        
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
        int t = input.nextInt();
        int l = input.nextInt();
        int r = input.nextInt();
        int k = 1;
        
        while (j != f) {
            if (i > t && k < m) {
                t = input.nextInt();
                l = input.nextInt();
                r = input.nextInt();
                k++;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res.append('X');
            } else {
                res.append(c);
                j += d;
            }
            i++;
        }
        System.out.println(res.toString());
    }
}

