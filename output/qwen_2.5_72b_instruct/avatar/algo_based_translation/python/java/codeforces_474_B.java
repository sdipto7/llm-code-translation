
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Read a line of input (not used)
        int r = 1;
        for (String k : scanner.nextLine().split(" ")) {
            int repeat = Integer.parseInt(k);
            for (int i = 0; i < repeat; i++) {
                L.add(r);
            }
            r++;
        }
        scanner.nextLine(); // Read a line of input (not used)
        for (String j : scanner.nextLine().split(" ")) {
            int index = Integer.parseInt(j) - 1;
            System.out.println(L.get(index));
        }
        scanner.close();
    }
}

