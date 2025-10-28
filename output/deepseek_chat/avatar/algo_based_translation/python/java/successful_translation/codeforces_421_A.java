import java.util.Scanner;
import java.util.Arrays;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        
        int[] lista = new int[a];
        for (int i = 0; i < a; i++) {
            lista[i] = scanner.nextInt();
        }
        scanner.nextLine();
        
        int[] listb = new int[b];
        for (int i = 0; i < b; i++) {
            listb[i] = scanner.nextInt();
        }
        
        for (int k = 0; k < n; k++) {
            boolean found = false;
            for (int num : lista) {
                if (num == k + 1) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
    }
}
