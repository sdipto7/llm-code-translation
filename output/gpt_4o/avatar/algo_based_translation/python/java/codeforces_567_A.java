
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_567_A {

    public static void main(String[] args) {
        processList();
    }

    public static void processList() {
        Scanner scanner = new Scanner(System.in);

        int inp = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Integer> lista = new ArrayList<>();
        String[] inputNumbers = scanner.nextLine().split(" ");
        for (String num : inputNumbers) {
            lista.add(Integer.parseInt(num));
        }

        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                System.out.println((lista.get(i + 1) - lista.get(i)) + " " + (lista.get(lista.size() - 1) - lista.get(i)));
                continue;
            } else if (i == lista.size() - 1) {
                System.out.println((lista.get(lista.size() - 1) - lista.get(lista.size() - 2)) + " " + (lista.get(lista.size() - 1) - lista.get(0)));
                continue;
            } else {
                if (lista.get(i) - lista.get(i - 1) > lista.get(i + 1) - lista.get(i)) {
                    System.out.print((lista.get(i + 1) - lista.get(i)) + " ");
                } else {
                    System.out.print((lista.get(i) - lista.get(i - 1)) + " ");
                }

                if (lista.get(lista.size() - 1) - lista.get(i) > lista.get(i) - lista.get(0)) {
                    System.out.println(lista.get(lista.size() - 1) - lista.get(i));
                } else {
                    System.out.println(lista.get(i) - lista.get(0));
                }
            }
        }

        scanner.close();
    }
}

