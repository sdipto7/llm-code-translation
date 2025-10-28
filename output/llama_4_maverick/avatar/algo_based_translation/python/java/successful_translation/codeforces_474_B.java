
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> L = new ArrayList<>();
        scanner.nextLine();
        String[] parts = scanner.nextLine().split(" ");
        int r = 1;
        for (String k : parts) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                L.add(r);
            }
            r++;
        }
        scanner.nextLine();
        parts = scanner.nextLine().split(" ");
        for (String j : parts) {
            System.out.println(L.get(Integer.parseInt(j) - 1));
        }
    }
}

