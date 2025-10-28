
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);

        Set<Integer> lista = new HashSet<>();
        inputs = scanner.nextLine().split(" ");
        for (String x : inputs) {
            lista.add(Integer.parseInt(x));
        }

        scanner.nextLine(); // Consume the next line

        for (int k = 0; k < n; k++) {
            if (lista.contains(k + 1)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}

