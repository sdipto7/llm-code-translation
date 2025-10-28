
import java.util.Scanner;

public class codeforces_567_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] lista = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            lista[i] = Integer.parseInt(inputArray[i]);
        }
        int n = lista.length;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                int minDiff = lista[i + 1] - lista[i];
                int maxDiff = lista[n - 1] - lista[i];
                System.out.println(minDiff + " " + maxDiff);
            } else if (i == n - 1) {
                int minDiff = lista[i] - lista[i - 1];
                int maxDiff = lista[i] - lista[0];
                System.out.println(minDiff + " " + maxDiff);
            } else {
                int prevDiff = lista[i] - lista[i - 1];
                int nextDiff = lista[i + 1] - lista[i];
                if (prevDiff > nextDiff) {
                    System.out.print(nextDiff + " ");
                } else {
                    System.out.print(prevDiff + " ");
                }
                int fromFirst = lista[i] - lista[0];
                int fromLast = lista[n - 1] - lista[i];
                System.out.println(Math.max(fromFirst, fromLast));
            }
        }
        scanner.close();
    }
}

