
import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);
        String[] listaStr = scanner.nextLine().split(" ");
        String[] listbStr = scanner.nextLine().split(" ");
        int[] lista = new int[listaStr.length];
        int[] listb = new int[listbStr.length];
        for (int i = 0; i < listaStr.length; i++) {
            lista[i] = Integer.parseInt(listaStr[i]);
        }
        for (int i = 0; i < listbStr.length; i++) {
            listb[i] = Integer.parseInt(listbStr[i]);
        }
        for (int k = 1; k <= n; k++) {
            boolean found = false;
            for (int i : lista) {
                if (i == k) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

