
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_421_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Operations
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int a = Integer.parseInt(firstLine[1]);
        int b = Integer.parseInt(firstLine[2]);

        List<Integer> lista = new ArrayList<>();
        String[] secondLine = scanner.nextLine().split(" ");
        for (String x : secondLine) {
            lista.add(Integer.parseInt(x));
        }

        List<Integer> listb = new ArrayList<>();
        String[] thirdLine = scanner.nextLine().split(" ");
        for (String x : thirdLine) {
            listb.add(Integer.parseInt(x));
        }

        // Logic Flow and Output Operations
        for (int k = 0; k < n; k++) {
            if (lista.contains(k + 1)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }

        scanner.close();
    }
}

