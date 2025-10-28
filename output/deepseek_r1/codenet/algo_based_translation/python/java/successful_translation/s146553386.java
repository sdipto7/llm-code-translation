
import java.util.Scanner;

public class s146553386 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] a0 = new int[n];
        int[] a1 = new int[n];
        
        String[] line0 = scanner.nextLine().split(" ");
        String[] line1 = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            a0[i] = Integer.parseInt(line0[i]);
            a1[i] = Integer.parseInt(line1[i]);
        }
        
        for (int i = 0; i < a1.length / 2; i++) {
            int temp = a1[i];
            a1[i] = a1[a1.length - 1 - i];
            a1[a1.length - 1 - i] = temp;
        }
        
        int[] res0 = new int[n];
        res0[0] = a0[0];
        for (int i = 1; i < n; i++) {
            res0[i] = res0[i - 1] + a0[i];
        }
        
        int[] res1 = new int[n];
        res1[0] = a1[0];
        for (int i = 1; i < n; i++) {
            res1[i] = res1[i - 1] + a1[i];
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int check = res0[i] + res1[n - 1 - i];
            if (check > ans) {
                ans = check;
            }
        }
        
        System.out.println(ans);
    }
}

