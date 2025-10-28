
import java.util.Scanner;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        
        int[] l = new int[n];
        String[] inputValues = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(inputValues[i]);
        }
        
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            int num = l[i];
            if (num % m == 0) {
                l2[i] = num / m;
            } else {
                l2[i] = (num / m) + 1;
            }
        }
        
        int mx = Integer.MIN_VALUE;
        for (int value : l2) {
            if (value > mx) {
                mx = value;
            }
        }
        
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
            }
        }
        
        System.out.println(ind + 1);
    }
}

