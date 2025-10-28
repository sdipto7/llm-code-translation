
import java.util.Scanner;
import java.util.ArrayList;

public class s491954463 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int a1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            a.add(a1);
            b.add(b1);
        }
        
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int num : a) {
                if (num == i) count++;
            }
            for (int num : b) {
                if (num == i) count++;
            }
            System.out.println(count);
        }
        scanner.close();
    }
}

