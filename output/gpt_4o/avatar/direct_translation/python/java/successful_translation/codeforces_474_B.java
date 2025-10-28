
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int r = 1;
        String[] kValues = scanner.nextLine().split(" ");
        for (String k : kValues) {
            int count = Integer.parseInt(k);
            for (int i = 0; i < count; i++) {
                L.add(r);
            }
            r++;
        }
        scanner.nextLine();
        String[] jValues = scanner.nextLine().split(" ");
        for (String j : jValues) {
            int index = Integer.parseInt(j) - 1;
            System.out.println(L.get(index));
        }
        scanner.close();
    }
}

