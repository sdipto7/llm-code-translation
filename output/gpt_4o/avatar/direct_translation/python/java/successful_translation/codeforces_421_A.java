
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        Set<Integer> lista = new HashSet<>();
        for (int i = 0; i < a; i++) {
            lista.add(scanner.nextInt());
        }
        
        Set<Integer> listb = new HashSet<>();
        for (int i = 0; i < b; i++) {
            listb.add(scanner.nextInt());
        }
        
        for (int k = 0; k < n; k++) {
            if (lista.contains(k + 1)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

