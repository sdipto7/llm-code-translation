
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        for (int i = 0; i < lista.length; i++) {
            if (i == 0) {
                System.out.println((lista[i + 1] - lista[i]) + " " + (lista[lista.length - 1] - lista[i]));
                continue;
            } else if (i == lista.length - 1) {
                System.out.println((lista[lista.length - 1] - lista[lista.length - 2]) + " " + (lista[lista.length - 1] - lista[0]));
                continue;
            } else {
                int minDiff;
                if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                    minDiff = lista[i + 1] - lista[i];
                } else {
                    minDiff = lista[i] - lista[i - 1];
                }
                System.out.print(minDiff + " ");
                if (lista[lista.length - 1] - lista[i] > lista[i] - lista[0]) {
                    System.out.println(lista[lista.length - 1] - lista[i]);
                } else {
                    System.out.println(lista[i] - lista[0]);
                }
            }
        }
    }
}

